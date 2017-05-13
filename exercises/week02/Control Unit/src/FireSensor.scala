import scala.util.Random

class FireSensor extends Sensor {
  
  var battery = 100.00
  val r = scala.util.Random
  var location = "Lobby"
  
  override def isTriggered: Boolean = {
    battery -= 10
    return  r.nextInt(100) < 5
  }

  override def getLocation: String = location

  override def getSensorType: String = "Fire Sensor"

  override def getBatteryPercentage: Double = battery
}
