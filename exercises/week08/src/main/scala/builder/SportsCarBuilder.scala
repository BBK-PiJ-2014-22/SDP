package builder

// TODO

object SportsCarBuilder extends CarBuilder {
  
  val car = new Car("Sports")
  val body = ("External dimensions: overall length (inches): 192.3,"
              + "overall width (inches): 75.5, overall height (inches): "
              + "54.2, wheelbase (inches): 112.3, front track (inches): 63.7,"
              + "rear track (inches): 64.1 and curb to curb turning circle (feet): 37.7")
  val power = "323 hp @ 6,800 rpm; 278 ft lb of torque @ 4,800 rpm"
  val engine = "3.6L V 6 DOHC and variable valve timing"
  val breaks = "Four-wheel disc brakes: two ventilated. Electronic brake distribution. Stability control"
  val seats = ("Driver sports front seat with one power adjustments manual height,"
               + "front passenger seat sports front seat with one power adjustments")
  val windows = "Front windows with one-touch on two windows"
  val fueltype = "Petrol 17 MPG city, 28 MPG highway, 20 MPG combined and 380 mi. range"
  
  
  
  override def buildBodyStyle: Unit = car.setBodyStyle(body)
  
  override def buildPower: Unit = car.setPower(power)

  override def buildEngine: Unit = car.setEngine(engine)

  override def buildBreaks: Unit = car.setBreaks(breaks)

  override def buildSeats: Unit = car.setSeats(seats)

  override def buildWindows: Unit = car.setWindows(windows)
  
  override def buildFuelType: Unit = car.setFuelType(fueltype)

  override def getCar: Car = {

    car
  }
}

