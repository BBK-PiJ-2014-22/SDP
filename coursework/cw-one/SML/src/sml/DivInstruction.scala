package sml

class DivInstruction (label: String, op: String, val result: Int, val op1: Int, val op2: Int)
extends Instruction(label, op){

  override def execute(m: Machine) {
    m.regs(result) = m.regs(op1) / m.regs(op2)
  }
  
  override def toString(): String = {
    super.toString + " " + op1 + " / " + op2 + " to " + result+"\n"
  }
  
}

object DivInstruction {
  def apply(label: String, result: Int, op1: Int, op2: Int) = 
    new MulInstruction(label, "div", result, op1, op2)
}
  