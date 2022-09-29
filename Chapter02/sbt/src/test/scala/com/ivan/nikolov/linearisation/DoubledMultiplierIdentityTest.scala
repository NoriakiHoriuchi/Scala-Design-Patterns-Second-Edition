package com.ivan.nikolov.linearisation

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class DoubledMultiplierIdentityTest extends AnyFlatSpec with Matchers {

  class DoubledMultiplierIdentityClass extends DoubledMultiplierIdentity
  
  val instance = new DoubledMultiplierIdentityClass
  
  "identity" should "return 2 * 1" in {
    instance.identity should equal(2)
  }
}
