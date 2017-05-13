package test

import main.NumberPersonalities

object NumberTest extends App {
  
  def testBools(tag: String, testCase : Boolean, expected : Boolean) = {
    if (testCase == expected) println(tag + " passed")
    else println(tag + "failed. Expected: "+expected + " Actual: " + testCase)
  }
  
  def testNum(tag: String, testCase : Int, expected : Int) = {
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
  
  testBools("Test isSquare(-1)", np.isSquare(-1), false)
  testBools("Test isSquare(0)", np.isSquare(0), false)
  testBools("Test isSquare(1)", np.isSquare(1), true)
  testBools("Test isSquare(5)", np.isSquare(5), false)
  testBools("Test isSquare(7)", np.isSquare(7), false)
  testBools("Test isSquare(4)", np.isSquare(4), true)
  testBools("Test isSquare(9)", np.isSquare(9), true)
  testBools("Test isSquare(16)", np.isSquare(16), true)
  testBools("Test isSquare(25)", np.isSquare(25), true)
  
  testBools("test isSmug(-1)", np.isSmug(-1), false)
  testBools("Test isSmug(0)", np.isSmug(0), false)
  testBools("test isSmug(1)", np.isSmug(1), false)
  testBools("test isSmug(3)", np.isSmug(3), false)
  testBools("test isSmug(7)", np.isSmug(7), false)
  testBools("test isSmug(9)", np.isSmug(9), false)
  testBools("test isSmug(2)", np.isSmug(2), true)
  testBools("test isSmug(5)", np.isSmug(5), true)
  testBools("test isSmug(7)", np.isSmug(8), true)
  testBools("test isSmug(10)", np.isSmug(10), true)
  testBools("test isSmug(13)", np.isSmug(13), true)
  
  testBools("test isPronic(-1)", np.isPronic(-1), false) 
  testBools("test isPronic(0)", np.isPronic(0), false)
  testBools("test isPronic(1)", np.isPronic(1), false)
  testBools("test isPronic(3)", np.isPronic(3), false)
  testBools("test isPronic(19)", np.isPronic(19), false)
  testBools("test isPronic(2)", np.isPronic(2), true)
  testBools("test isPronic(6)", np.isPronic(6), true)
  testBools("test isPronic(12)", np.isPronic(12), true)    
  testBools("test isPronic(20)", np.isPronic(20), true)
  
  testNum("test sumOfPositiveDivisorsOf(1)", np.sumOfPositiveDivisorsOf(1), 0)
  testNum("test sumOfPositiveDivisorsOf(2)", np.sumOfPositiveDivisorsOf(2), 1)
  testNum("test sumOfPositiveDivisorsOf(3)", np.sumOfPositiveDivisorsOf(3), 1)
  testNum("test sumOfPositiveDivisorsOf(4)", np.sumOfPositiveDivisorsOf(4), 3)
  testNum("test sumOfPositiveDivisorsOf(5)", np.sumOfPositiveDivisorsOf(5), 1)
  testNum("test sumOfPositiveDivisorsOf(6)", np.sumOfPositiveDivisorsOf(6), 6)
  testNum("test sumOfPositiveDivisorsOf(7)", np.sumOfPositiveDivisorsOf(7), 1)
  testNum("test sumOfPositiveDivisorsOf(8)", np.sumOfPositiveDivisorsOf(8), 7)
  testNum("test sumOfPositiveDivisorsOf(9)", np.sumOfPositiveDivisorsOf(9), 4)
  testNum("test sumOfPositiveDivisorsOf(10)", np.sumOfPositiveDivisorsOf(10), 8)
  testNum("test sumOfPositiveDivisorsOf(11)", np.sumOfPositiveDivisorsOf(11), 1)
  testNum("test sumOfPositiveDivisorsOf(12)", np.sumOfPositiveDivisorsOf(12), 16)
  testNum("test sumOfPositiveDivisorsOf(13)", np.sumOfPositiveDivisorsOf(13), 1)
  testNum("test sumOfPositiveDivisorsOf(14)", np.sumOfPositiveDivisorsOf(14), 10)
  testNum("test sumOfPositiveDivisorsOf(15)", np.sumOfPositiveDivisorsOf(15), 9)
  testNum("test sumOfPositiveDivisorsOf(16)", np.sumOfPositiveDivisorsOf(16), 15)
  testNum("test sumOfPositiveDivisorsOf(17)", np.sumOfPositiveDivisorsOf(17), 1)
  testNum("test sumOfPositiveDivisorsOf(18)", np.sumOfPositiveDivisorsOf(18), 21)
  testNum("test sumOfPositiveDivisorsOf(19)", np.sumOfPositiveDivisorsOf(19), 1)
  testNum("test sumOfPositiveDivisorsOf(20)", np.sumOfPositiveDivisorsOf(20), 22)

}


 