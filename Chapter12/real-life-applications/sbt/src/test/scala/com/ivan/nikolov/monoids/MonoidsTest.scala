package com.ivan.nikolov.monoids

import org.scalacheck.Arbitrary

import scalaz._

import scalaz.scalacheck.ScalazProperties._
import org.scalatestplus.scalacheck.Checkers
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class MonoidsTest extends AnyFlatSpec with Matchers with Checkers {

  implicit def arbString(implicit ev: Arbitrary[String]): Arbitrary[String] =
    Arbitrary { ev.arbitrary.map(identity) }
  
  "stringConcatenation monoid" should "satisfy the identity rule." in {
    monoid.laws[String](stringConcatenation, Equal.equalA[String], arbString).check()
  }
}
