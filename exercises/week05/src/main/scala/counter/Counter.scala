package counter

class Counter(var count : Int)  {
  
  def inc() = count += 1
  
  def dec() = count -= 1
  
}

object Counter