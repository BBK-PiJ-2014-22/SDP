package test

import main.NumberPersonalities

object NumberTest extends App {
  
  def testBools(tag: String, testCase : Boolean, expected : Boolean) = {
    if (testCase == expected) println(tag + " passed")
    else println(tag + "failed. Expected: "+expected + " Actual: " + testCase)
  }
  
  val np = NumberPersonalities
  
  //Test Prime
  
  testBools("Test isPrime(1)", np.isPrime(-1), false)
  testBools("Test isPrime(1)", np.isPrime(0), false)
  testBools("Test isPrime(1)", np.isPrime(1), false)
  testBools("Test isPrime(1)", np.isPrime(2), true)
  testBools("Test isPrime(1)", np.isPrime(3), true)
  testBools("Test isPrime(1)", np.isPrime(4), false)
  testBools("Test isPrime(1)", np.isPrime(5), true)
  
  
  
  
}