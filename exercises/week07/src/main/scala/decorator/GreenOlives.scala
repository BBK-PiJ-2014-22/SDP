package decorator

class GreenOlives(val pizza: Pizza) extends Pizza {
  val desc = "Green Olives"
  val price = 1.0
  
  def getDesc: String = pizza.getDesc + ", " + desc 

  def getPrice: Double = pizza.getPrice + price
}
