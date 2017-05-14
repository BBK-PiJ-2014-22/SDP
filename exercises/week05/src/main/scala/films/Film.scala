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

object Film