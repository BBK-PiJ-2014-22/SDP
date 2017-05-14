package test.scala

import org.scalatest._
import main.scala.factory._

class FactoryTests extends FunSuite {
  
  test("Basic") {
    val prod = new ConcreteProduct
    assert(prod.productType == "Concrete Product")
  }
  
  test("ConcreteCreator") {
    val creator = new ConcreteCreator
    val prod = creator.apply()
    assert(prod.productType == "Concrete Product")
  }
}