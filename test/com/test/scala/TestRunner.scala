package com.test.scala

import org.scalatest.testng.TestNGWrapperSuite

class TestRunner extends TestNGWrapperSuite (
  List("testng.xml")
)