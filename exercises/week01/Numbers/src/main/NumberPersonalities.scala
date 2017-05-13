

package main

object NumberPersonalities {
  val limit = 100
  
  def main(args: Array[String]) {
    
  }
  
  /***Returns True if n is prime
   * 
   */
  def isPrime(n: Int) : Boolean = {
    if (n <= 1) {
      return false
    } else {
     for( i <- 2 to n-1){
        if (n % i == 0) return false
      }
     return true
    }
  }
  
  /** Returns True if N is happy*/
  def isHappy(n: Int) : Boolean = {
    
    val unhappy = Array(4, 16, 37, 58, 89, 145, 42, 20)
    
    if (n <= 0) return false
    
    val digits = for (i <- n.toString.split("")) yield i.toInt
    val squares = for (i <- digits) yield (i * i)
    val total = squares.sum
 
    if (total == 1) return true
    else if (unhappy.contains(total)) return false
    else return isHappy(total)
    
  }
  
  def isTriangular(n: Int) : Boolean = {
    var base = 1
    var total = n
    while (total > 0){
      total -= base
      base += 1}
    return total == 0
  }
  
  def isSquare(n: Int) : Boolean = {
    var base = 1
    var total = n
    if (n == 0) return false
    while (total > 0){
      total -= base
      base += 2}
    return total == 0
  }
  
  def isSmug(n: Int) : Boolean = {
    for (i <- 1 to n) {
      if (isSquare(n - i*i)) return true
    }
    return false
  }
  
  def isHonest(n: Int) : Boolean = {
    for (i <- 1 to n){
      val result = n/i
      if (result == i && i*i != n) return true
      if (result < n) return false
    }
    return false
  }
  
  
  def isPronic(n: Int) : Boolean = {
    for (i <- 1 to n) {
      val test = i * (i+1)
      if (n == test) return true
      if (test > n ) return false
    }
    return false
  }
  
  
  def isDeficient(n: Int) : Boolean = {
    return sumOfPositiveDivisorsOf(n) < n
  }
  
  def isPerfect(n: Int) : Boolean = {
    return sumOfPositiveDivisorsOf(n) == n 
  }
  
  def isAbundant(n: Int) : Boolean = {
    return sumOfPositiveDivisorsOf(n) > n 
  }
  
  def sumOfPositiveDivisorsOf(n: Int): Int = {
    val factors = for (i <- 1 to n-1 if n % i == 0) yield i
    return factors.sum
  }
}


