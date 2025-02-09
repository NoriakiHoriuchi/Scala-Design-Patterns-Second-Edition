package com.ivan.nikolov.composition

import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class TraitATest extends FlatSpec with Matchers with A {

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
