package films

class Director (val firstName : String, val lastName : String, val yearOfBirth : Int ){
  
  /**Returns the full name of the director*/
  def name() : String = firstName + " " + lastName
}

object Director