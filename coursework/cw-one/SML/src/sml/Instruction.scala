package sml

abstract class Instruction(label: String, opcode: String) {

  override def toString(): String = label + ": " + opcode

  def execute(m: Machine): Unit
  
  def hasLabel(testLabel : String) : Boolean = {
    label == testLabel
  }
}