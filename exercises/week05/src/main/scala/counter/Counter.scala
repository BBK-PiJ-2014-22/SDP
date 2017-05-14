package counter

/** Immutable data type which keeps count*/
class Counter(val count : Int)  {
  
  /**increments the counter by n, where n=1 by default*/
  def inc(n=1) = new Counter(count+n)
  
  /**decrements the counter by n, where n=1 by default*/  
  def dec(n=1) = new Counter(count-n)
  
}

object Counter