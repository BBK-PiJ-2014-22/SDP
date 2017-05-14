package builder

//TODO

object SedanCarBuilder extends CarBuilder {

    val car = new Car("Sedan")
    val body = ("External dimensions: overall length (inches): 202.9, "
              + "overall width (inches): 76.2, overall height (inches): 60.7, "
              + "wheelbase (inches): 112.9, front track (inches): 65.3, "
              + "rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5")
    val power = "285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm"
    val engine = "3.5L Duramax V 6 DOHC"
    val breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution"
    val seats = ("Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats")
    val windows = "Laminated side windows.Fixed rear window with defroster"
    val fueltype = "Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range"
  
  
  
  override def buildBodyStyle: Unit = car.setBodyStyle(body)
  
  override def buildPower: Unit = car.setPower(power)

  override def buildEngine: Unit = car.setEngine(engine)

  override def buildBreaks: Unit = car.setBreaks(breaks)

  override def buildSeats: Unit = car.setSeats(seats)

  override def buildWindows: Unit = car.setWindows(windows)
  
  override def buildFuelType: Unit = car.setFuelType(fueltype)

  override def getCar: Car = {
    buildBodyStyle
    buildPower
    buildEngine
    buildBreaks
    buildSeats
    buildWindows
    buildFuelType
    
    car
  }
}
