package com.example

import scala.collection.mutable
import scala.collection.immutable

object SetTest {

  def main(args: Array[String]): Unit = {

//    val s1 = immutable.Set(1, 2, "Will")
//
//    s1 += "done"
//
//    println(s1)

    val s2 = mutable.Set("Will", "done")

    s2 += "he"

    println(s2)


  }

}
