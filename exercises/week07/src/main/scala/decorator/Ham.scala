package decorator

class Ham(val pizza: Pizza) extends Pizza {
  val desc = "Ham"
  val price = 2.0
  
  def getDesc: String = pizza.getDesc + ", " + desc 

  def getPrice: Double = pizza.getPrice + price

}
