package films

class Director (val firstName : String, val lastName : String, val yearOfBirth : Int ){
  
  /**Returns the full name of the director*/
  def name() : String = firstName + " " + lastName
}

object Director {
  def apply(firstName : String, lastName : String, yearOfBirth : Int) = 
    new Director(firstName, lastName, yearOfBirth)
  
  def older (dir1 : Director , dir2 : Director) : Director = {
    if (dir1.yearOfBirth > dir2.yearOfBirth) return dir2 
    else return dir1
  }
}