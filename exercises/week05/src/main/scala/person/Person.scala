package person

case class Person ( firstName : String , lastName : String)

object Person {
  def apply (fullName : String) = {
    val names = fullName.split(" ")
    new Person(names(0), names(1))
  }
}