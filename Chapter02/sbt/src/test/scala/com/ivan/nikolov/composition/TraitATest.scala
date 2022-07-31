package com.ivan.nikolov.composition

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TraitATest extends AnyFlatSpec with Matchers with A {

  "hello" should "greet properly." in {
    hello() should equal("Hello, I am trait A!")
  }
  
  "pass" should "return the right string with the number." in {
    pass(10) should equal("Trait A said: 'You passed 10.'")
  }
  
  it should "be correct also for negative values." in {
    pass(-10) should equal("Trait A said: 'You passed -10.'")
  }
}
