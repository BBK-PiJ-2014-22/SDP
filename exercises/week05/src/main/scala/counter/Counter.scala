package counter

class Counter(val count : Int)  {
  
  def inc() = new Counter(count+1)
  
  def dec() = new Counter(count-1)
  
}

object Counter