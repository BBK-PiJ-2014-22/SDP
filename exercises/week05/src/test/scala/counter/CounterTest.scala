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
    
  test("Increment Test - 1 increment") {
    val ctr = new Counter(10)
    ctr.inc()
    assert(ctr.count == 11)
        
}
  test("Increment Test - 10 increment") {
    val ctr = new Counter(10)
    for (i <- 1 to 10) ctr.inc()
    assert(ctr.count == 20)
        
}
    
  test("Decrement Test - 1 decrement") {
    val ctr = new Counter(10)
    ctr.dec()
    assert(ctr.count == 9)
        
}
  test("Increment Test - 10 decrements") {
    val ctr = new Counter(10)
    for (i <- 1 to 10) ctr.dec()
    assert(ctr.count == 0)
        
}
}
