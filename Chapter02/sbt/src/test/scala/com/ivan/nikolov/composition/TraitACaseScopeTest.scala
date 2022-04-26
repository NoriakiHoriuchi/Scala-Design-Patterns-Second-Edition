package com.ivan.nikolov.composition

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

class TraitACaseScopeTest extends AnyFlatSpec with Matchers {
  "hello" should "greet properly." in new A {
    hello() should equal("Hello, I am trait A!")
  }

  "pass" should "return the right string with the number." in new A {
    pass(10) should equal("Trait A said: 'You passed 10.'")
  }

  it should "be correct also for negative values." in new A {
    pass(-10) should equal("Trait A said: 'You passed -10.'")
  }
}
