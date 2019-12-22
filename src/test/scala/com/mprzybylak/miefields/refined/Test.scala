package com.mprzybylak.miefields.refined

import eu.timepit.refined._
import eu.timepit.refined.api.Refined
import eu.timepit.refined.auto._
import eu.timepit.refined.numeric._
import org.scalatest.matchers.should.Matchers._

import org.scalatest.wordspec.AnyWordSpec

class Test extends AnyWordSpec {

  val left = Symbol("left")
  val right = Symbol("right")

  "Literals validation" should {

    "compile time check for positive number" in {
      val positive: Int Refined Positive = 1
      //    val negative: Int Refined Positive = -1 // will not compile
    }

    "compile time check for positive number using refineMV macro" in {
      val positive = refineMV[Positive](2)
      //    val negative = refineMV[Positive](-2) // will not compile
    }
  }

  "Values validation" should {

    "runtime check for positive number" in {
      val p = 1
      val positive = refineV[Positive](p)
      positive should be(right)

      val n = -1
      val notPositive = refineV[Positive](n)
      notPositive should be(left)
    }

  }

}
