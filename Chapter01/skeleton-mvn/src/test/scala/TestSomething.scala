import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import org.scalatest.{FlatSpec, Matchers}

@RunWith(classOf[JUnitRunner])
class TestSomething extends FlatSpec with Matchers {

  "something" should "succeed" in {
    "text" should be("text")
  }

}
