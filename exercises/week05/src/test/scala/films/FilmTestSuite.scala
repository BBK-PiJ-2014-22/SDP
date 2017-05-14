package films

import org.scalatest.FunSuite
import films.Director._
import films.Film._

class FilmTestSuite extends  FunSuite{
  
   val  dir = new Director("Clint", "Eastwood", 1930)
   val  fil = new Film("High Plains Drifter", 1973, 7.7, dir)
   val  dir2 = new Director("Norman", "Jewison", 1926)
  
 
  test("Test Director Constructor") {   
    assert(dir.firstName == "Clint" && dir.lastName == "Eastwood" && dir.yearOfBirth == 1930) 
  }
  
  test("Test Film Constructor") {
    assert(   fil.name == "High Plains Drifter"
           && fil.yearOfRelease == 1973
           && fil.imdbRating == 7.7
           && fil.director.firstName == "Clint" 
           && fil.director.lastName == "Eastwood" 
           && fil.director.yearOfBirth == 1930) 
  }
  
  test("Test Name Method") {
     assert(dir.name() == "Clint Eastwood")
  }
  
  test("Test Director's Age") {
    assert(fil.directorsAge() == 43)
  }
  
  test("Test isDirectedBy - Positive") {
     assert(fil.isDirectedBy(dir) == true)
  }
  
  test("Test isDirectedBy - Negative") {

     assert(fil.isDirectedBy(dir) == true)
  }
  
  test("Copy: No params") {
    fil_copy = fil.copy()
    assert (
        fil_copy.name == "High Plains Drifter"
     && fil_copy.yearOfRelease == 1973
     && fil_copy.imdbRating == 7.7
     && fil_copy.director == dir
     )
  }
  
  test("Copy: Name Change") {
    fil_copy = fil.copy(name = "New Name")
    assert (
        fil_copy.name == "New Name"
     && fil_copy.yearOfRelease == 1973
     && fil_copy.imdbRating == 7.7
     && fil_copy.director == dir
     && fil.name == "High Plains Drifter")
  }
    
  test("Copy: Year Change") {
    fil_copy = fil.copy(yearOfRelease = 1980)
    assert (
        fil_copy.name == "High Plains Drifter"
     && fil_copy.yearOfRelease == 1980
     && fil_copy.imdbRating == 7.7
     && fil_copy.director == dir
     && fil.yearOfRelease == 1973)
  }
    
  test("Copy: Rating Change") {
    fil_copy = fil.copy(imdbRating = 9.9)
    assert (
        fil_copy.name == "High Plains Drifter"
     && fil_copy.yearOfRelease == 1973
     && fil_copy.imdbRating == 9.9
     && fil_copy.director == dir
     && fil.imdbRating == 7.7)
  }
  test("Copy: Director Change") {
    fil_copy = fil.copy(director = dir2)
    assert (
        fil_copy.name == "High Plains Drifter"
     && fil_copy.yearOfRelease == 1973
     && fil_copy.imdbRating == 7.7
     && fil_copy.director == dir2
     && fil.director == dir)
  }
}