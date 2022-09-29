import org.junit.runner.RunWith
import org.scalatestplus.junit.JUnitRunner
import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should.Matchers

@RunWith(classOf[JUnitRunner])
class TestSomething extends AnyFlatSpec with Matchers {

  "something" should "succeed" in {
    "text" should be("text")
  }

}
