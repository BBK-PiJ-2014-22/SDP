package code

/*object Singleton { //Lazy Singleton
  var instance: Singleton = null
  def apply(arg: Int) = {
    if (instance == null)
       instance = new Singleton(arg)
    instance
  }
}*/

object Singleton { //Eager Singleton
  var instance: Singleton = new Singleton()
  def apply(arg: Int) = {
    if (instance == null)
       instance = new Singleton(arg)
    instance
  }
}

class Singleton private (x : Int)
