package com.mprzybylak.miefields.refined

import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric._

import org.scalatest.wordspec.AnyWordSpec

class Test extends AnyWordSpec {

  "compile time check for positive number" in {
    val positive: Int Refined Positive = 1
//    val negative: Int Refined Positive = -1 // will not compile
  }

}
