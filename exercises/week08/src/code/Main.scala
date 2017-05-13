package code

object Main extends App {
  
  val x = Singleton.apply(3)
  val y = Singleton.apply(3)

  
  println(x)
  println(y)
  
}