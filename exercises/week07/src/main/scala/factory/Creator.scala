package main.scala.factory

trait Creator {
  
  def apply() : Product = new ConcreteProduct
}