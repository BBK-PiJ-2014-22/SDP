package sml

class BnzInstruction (label : String, op : String, testReg : Int, newInstruction : String ) 
  extends Instruction(label, op) {
  
  override def execute(m : Machine) {
    if (m.regs(testReg) != 0) {
      val option = m.prog.find(x => x.hasLabel(newInstruction))
      
      option match {
        case Some(result) => 
          val index = m.prog.indexOf(result)
          m.pc = index
        case None  =>
          println("No such instruction: " + newInstruction)
      }
    }
  }
  override def toString(): String = {
    super.toString + " testing " + testReg + " to branch to " + newInstruction + "\n"
  }
  
}

object BnzInstruction {
    def apply(label: String, testReg: Int, newInstruction: String) =
    new BnzInstruction(label, "bnz", testReg, newInstruction)
}