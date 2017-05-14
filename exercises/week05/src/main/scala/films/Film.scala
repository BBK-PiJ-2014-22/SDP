package films

class Film (val name : String, val yearOfRelease: Int, val imdbRating : Double, val director: Director){
  
  /** Returns the directors age at release of the film*/
  def directorsAge() = yearOfRelease - director.yearOfBirth
  
  /** Returns true if dir (Director) is the director of the film*/
  def isDirectedBy(dir : Director) : Boolean = dir == director
  
  def copy(name : String = this.name, yearOfRelease : Int = this.yearOfRelease, 
      imdbRating : Double = this.imdbRating, director : Director = this.director) = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
}

object Film {
  
  def apply(name : String, yearOfRelease : Int, imdbRating : Double, director : Director) = {
    new Film(name, yearOfRelease, imdbRating, director)
  }
  
  def highestRating(film1 : Film, film2 : Film) = {
    if (film1.imdbRating > film2.imdbRating) film1 else film2
  }
  
  def oldestDirectorAtTheTime(film1 : Film, film2 : Film) = {
    if (film1.directorsAge() > film2.directorsAge()) film1.director else film2.director
  }
}