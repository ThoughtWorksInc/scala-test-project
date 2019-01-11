import org.scalatest.{FlatSpec, Matchers}

class AFailingTest extends FlatSpec with Matchers {
  "This test" should "fail" in {
    false should be (true)
  }
}
