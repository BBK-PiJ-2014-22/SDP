package decorator

class Meat(val pizza: Pizza) extends Pizza {
  val desc = "Dodgy Unspecified Meat"
  val price = 2.0
  
  def getDesc: String = pizza.getDesc + ", " + desc 

  def getPrice: Double = pizza.getPrice + price
}