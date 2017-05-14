package decorator

class Cheese(val pizza: Pizza) extends Pizza {
  val desc = "Cheese"
  val price = 1.5
  
  def getDesc: String = pizza.getDesc + ", " + desc 

  def getPrice: Double = pizza.getPrice + price
}
