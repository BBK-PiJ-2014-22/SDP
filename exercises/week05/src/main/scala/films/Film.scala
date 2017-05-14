package films

class Film (val name : String, val yearOfRelease: Int, val imdbRating : Double, val director: Director){
  
  /** Returns the directors age at release of the film*/
  def directorsAge() = ???
  
  /** Returns true if dir (Director) is the director of the film*/
  def isDirectedBy(dir : Director) : Boolean = ???
}

object Film