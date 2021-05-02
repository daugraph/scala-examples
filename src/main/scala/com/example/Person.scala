package com.example

class Person {
  var name = ""
  override def toString = getClass.getName + "[name=" + name + "]"
}
