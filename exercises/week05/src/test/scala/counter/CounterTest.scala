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
    val ctr2 = ctr.inc
    assert(ctr2.count == 11 && ctr.count == 10)
        
}
  test("Increment Test - 5 increment") {
    val ctr = new Counter(10)
    val ctr2 =  ctr.inc.inc.inc.inc.inc
    assert(ctr2.count == 15 && ctr.count == 10)
    
}
    
  test("Decrement Test - 1 decrement") {
    val ctr = new Counter(10)
    val ctr2 = ctr.dec()
    assert(ctr2.count == 9 && ctr.count == 10)
        
}
  test("Increment Test - 10 decrements") {
    val ctr = new Counter(10)
    val ctr2 = ctr.dec.dec.dec.dec.dec
    assert(ctr2.count == 5 && ctr.count == 10)
        
}
}
