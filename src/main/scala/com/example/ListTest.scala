package com.example

import scala.::

object ListTest {

  def main(args: Array[String]): Unit = {

    val thrill = List("fill", "until", "Will", "nil")

    println(thrill)

    println(thrill.count(s => s.length == 4))

    println(thrill.drop(2))

    println(thrill.forall(_.endsWith("l")))

    println(thrill.head)

    println(thrill.init)

    println(thrill.mkString(","))

    println(thrill.tail)

    println(thrill.sorted)

    println(thrill.sortWith((a, b) => a.toLowerCase() < b.toLowerCase()))


  }

}
