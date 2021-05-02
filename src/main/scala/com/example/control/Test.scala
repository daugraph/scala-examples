package com.example.control

import java.io.{File, FileReader}

object Test {

  def main(args: Array[String]): Unit = {
//    val filesHere = (new File(".")).listFiles()

//    for (file <- filesHere) {
//      println(file)
//    }
//
//    for (i <- 1 until 4) {
//      println(i)
//    }

//    for (file <- filesHere if file.getName.endsWith(".xml")) {
//      println(file)
//    }

//    def fileLines(file: java.io.File) = scala.io.Source.fromFile(file).getLines().toList
//
//    val file = new FileReader("pom.xml")
//    try {
//      val length = file.read()
//      println(length)
//    } finally {
//      file.close()
//    }
//
//    for (
//      file <- filesHere
//      if file.getName.endsWith(".xml");
//      line <- fileLines(file)
//      if line.trim.matches(".*plugin.*")
//    ) println(file + ": " + line.trim)
//
//
//    val forLineLengths = for {
//      file <- filesHere
//      if file.getName.endsWith(".xml")
//      line <- fileLines(file)
//      trimmed = line.trim
//      if trimmed.matches(".*plugin.*")
//    } yield trimmed.length
//
//    println(forLineLengths.mkString("Array(", ", ", ")"))


    def makeRowSeq(row: Int) = {
      for (col <- 1 to 10) yield {
        val prod = (row * col).toString
        val padding = " " * (4 - prod.length)
        padding + prod
      }
    }

    def makeRow(row: Int): String = {
      makeRowSeq(row).mkString
    }

    def multiTable(): String = {
      val table = for (row <- 1 to 10) yield makeRow(row)
      table.mkString("\n")
    }

    println(multiTable())

  }

}
