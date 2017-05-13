package test

import main.NumberPersonalities

object NumberTest extends App {
  
  def testBools(tag: String, testCase : Boolean, expected : Boolean) = {
    if (testCase == expected) println(tag + " passed")
    else println(tag + "failed. Expected: "+expected + " Actual: " + testCase)
  }
  
  val np = NumberPersonalities
  
  //Test Prime
  
  testBools("Test isPrime(-1)", np.isPrime(-1), false)
  testBools("Test isPrime(0)", np.isPrime(0), false)
  testBools("Test isPrime(1)", np.isPrime(1), false)
  testBools("Test isPrime(2)", np.isPrime(2), true)
  testBools("Test isPrime(3)", np.isPrime(3), true)
  testBools("Test isPrime(4)", np.isPrime(4), false)
  testBools("Test isPrime(5)", np.isPrime(5), true)
  
  
  testBools("Test isHappy(-1)", np.isHappy(-1), false)
  testBools("Test isHappy(0)", np.isHappy(0), false)
  testBools("Test isHappy(1)", np.isHappy(1), true)
  testBools("Test isHappy(7)", np.isHappy(7), true)
  testBools("Test isHappy(10)", np.isHappy(10), true)
  testBools("Test isHappy(28)", np.isHappy(28), true)
  testBools("Test isHappy(44)", np.isHappy(44), true)
  testBools("Test isHappy(68)", np.isHappy(68), true)
  testBools("Test isHappy(4)", np.isHappy(4), false)
  testBools("Test isHappy(95)", np.isHappy(95), false)
  
  testBools("Test isTriangular(-1)", np.isTriangular(-1), false)
  testBools("Test isTriangular(0)", np.isTriangular(0), false)
  testBools("Test isTriangular(1)", np.isTriangular(1), true)
  testBools("Test isTriangular(3)", np.isTriangular(3), true)
  testBools("Test isTriangular(6)", np.isTriangular(6), true)
  testBools("Test isTriangular(10)", np.isTriangular(10), true)
  testBools("Test isTriangular(2)", np.isTriangular(2), false)
  testBools("Test isTriangular(4)", np.isTriangular(4), false)
  testBools("Test isTriangular(5)", np.isTriangular(5), false)
  testBools("Test isTriangular(9)", np.isTriangular(9), false)
  
  
  



}
 