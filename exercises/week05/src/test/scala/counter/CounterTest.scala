package counter

import org.scalatest.FunSuite
import counter.Counter._

class CounterTest extends FunSuite {
  
  test("Constructor Test - positive") {
    val ctr = new Counter(10)
    assert(ctr.count == 10)
  }
  
    test("Constructor Test - negative") {
    val ctr = new Counter(-10)
    assert(ctr.count == -10)
  }
}
