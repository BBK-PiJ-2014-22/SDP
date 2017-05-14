package decorator

class RomaTomatoes(val pizza: Pizza) extends Pizza {
  val desc = "Roma Tomatoes"
  val price = 0.9
  
  def getDesc: String = pizza.getDesc + ", " + desc 

  def getPrice: Double = pizza.getPrice + price
}
