class SmokeSensor extends Sensor {
  
  var battery = 100.00
  val r = scala.util.Random
  var location = "Lobby"
  
  override def isTriggered: Boolean = {
    battery -= 20
    return  r.nextInt(100) < 10
  }

  override def getLocation: String = location

  override def getSensorType: String = "Smoke Sensor"

  override def getBatteryPercentage: Double = battery
}
