package counter

/** Immutable data type which keeps count*/
case class Counter(val count : Int = 0)  {
  
  /**increments the counter by n, where n=1 by default*/
  def inc(n: Int = 1) = Counter(count+n)
  
  /**decrements the counter by n, where n=1 by default*/  
  def dec(n : Int = 1) =  Counter(count-n)
  
}

