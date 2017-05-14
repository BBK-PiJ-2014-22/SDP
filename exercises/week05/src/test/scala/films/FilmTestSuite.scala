package films

import org.scalatest.FunSuite
import films.Director._
import films.Film._

class FilmTestSuite extends  FunSuite{
  
  test("Test Director Constructor") {
    val dir = new Director("Clint", "Eastwood", 1930)
    assert(dir.firstName == "Clint" && dir.lastName == "Eastwood" && dir.yearOfBirth == 1930) 
  }
  
  test("Test Film Constructor") {
    val dir = new Director("Clint", "Eastwood", 1930)
    val   fil = new Film("High Plains Drifter", 1973, 7.7, dir)
    assert(   fil.name == "High Plains Drifter"
           && fil.yearOfRelease == 1973
           && fil.imdbRating == 7.7
           && fil.director.firstName == "Clint" 
           && fil.director.lastName == "Eastwood" 
           && fil.director.yearOfBirth == 1930) 
  }
  
}