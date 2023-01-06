package dendron.tree;

import dendron.machine.Machine;

import java.util.List;
import java.util.Map;


public abstract class Assignment implements ActionNode {
    String indent;
    ExpressionNode rhs;

    public Assignment(String indent, ExpressionNode rhs) {
        this.indent = indent;
        this.rhs = rhs;

    }

    public List<Machine.Instruction> emit(){


        return (List<Machine.Instruction>) rhs;
    }

    public void infixDisplay() {
        System.out.println( rhs + "is equal to");

    }

    public void execute(Map<String,Integer> symTab) {
        String result = rhs + " = " + indent ;
        System.out.println(result);
        System.out.println(symTab);
    }




}
