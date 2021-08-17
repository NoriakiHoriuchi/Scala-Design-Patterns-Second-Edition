import org.junit.runner.RunWith
import org.scalatest.{FlatSpec, Matchers}
import org.scalatestplus.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class TestSomething extends FlatSpec with Matchers {

  "something" should "succeed" in {
    "text" should be("text")
  }

}
