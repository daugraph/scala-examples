package com.example.rational

import scala.annotation.tailrec
import scala.language.implicitConversions

class Rational(n: Int, d: Int) {

  require(d != 0)

  private val g =  gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = {
    this(n, 1)
  }


  override def toString: String = number + "/" + denom

  def + (that: Rational): Rational = {
    new Rational(
      number * that.denom + denom * that.number,
      denom * that.denom
    )
  }

  def + (i: Int): Rational = {
    new Rational(
      number + i * denom,
      denom
    )
  }

  def - (that: Rational): Rational = {
    new Rational(
      number * that.denom - denom * that.number,
      denom * that.denom
    )
  }

  def - (i: Int): Rational = {
    new Rational(
      number - i * denom,
      denom
    )
  }

  def * (that: Rational): Rational = {
    new Rational(
      number * that.number,
      denom * that.denom
    )
  }

  def * (i: Int): Rational = {
    new Rational(
      number * i,
      denom
    )
  }

  def / (that: Rational): Rational = {
    new Rational(
      number * that.denom,
      denom * that.number
    )
  }

  def / (i: Int): Rational = {
    new Rational(
      number,
      denom * i
    )
  }

  def lessThan(that: Rational): Boolean = {
    this.number * that.denom < this.denom * that.number
  }

  def max(that: Rational): Rational = {
    if (this.lessThan(that)) that else this
  }

  @tailrec
  private def gcd(a: Int, b: Int): Int = {
    if (b == 0) a else gcd(b, a % b)
  }

}

object Rational {

  implicit def intToRational(i: Int): Rational = new Rational(i)

  def main(args: Array[String]): Unit = {

    val r = new Rational(1,2)
    println(r)
    val r1 = new Rational(1,3)
    println(r1)
    println(r + r1)
    println(r.lessThan(r1))
    println(new Rational(2))
    println(r + 2)
    println(r / 2)
    println(r * 2)
    println(2 * r)

  }
}
