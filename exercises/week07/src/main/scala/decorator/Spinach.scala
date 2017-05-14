package decorator

class Spinach(val pizza: Pizza) extends Pizza {
  val desc = "Spinach"
  val price = 0.8
  
  def getDesc: String = pizza.getDesc + ", " + desc 

  def getPrice: Double = pizza.getPrice + price
}