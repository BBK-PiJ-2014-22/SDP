package sml

class BnzInstruction (label : String, op : String, testReg : Int, newInstruction : String ) 
  extends Instruction(label, op) {
  
  //Not Implmented... debugging option results
  override def execute(m : Machine) {
    if (m.regs(testReg) != 0) {
      val option = m.prog.find(x => x.hasLabel(newInstruction))
      
      option match {
        case Some(result) => 
          println(result)
        case None  =>
          println("None")
      }
    }
  }
  override def toString(): String = {
    super.toString + " testing " + testReg + " to branch to " + newInstruction + "/n"
  }
  
}

object BnzInstruction {
    def apply(label: String, testReg: Int, newInstruction: String) =
    new BnzInstruction(label, "bnz", testReg, newInstruction)
}