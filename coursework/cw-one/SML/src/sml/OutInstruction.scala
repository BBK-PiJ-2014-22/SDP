package sml

class OutInstruction (label : String, op : String, source : Int) 
 extends Instruction(label, op) {
  
  override def execute(m: Machine) = {

    println(m.regs(source))
  }
  
  override def toString(): String = {
    super.toString() + " Printing Register: " + source + "\n"
  }
}

object OutInstruction {
   def apply(label: String, source: Int) = 
    new OutInstruction(label, "out", source)
}