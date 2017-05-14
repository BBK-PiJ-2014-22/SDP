package main.scala.factory

class ConcreteCreator extends Creator{
  
  override def apply : ConcreteProduct = new ConcreteProduct
  
}