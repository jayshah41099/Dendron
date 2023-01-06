package dendron.tree;

import dendron.machine.Machine;


import java.util.List;
import java.util.Map;


public class Print implements ActionNode {

    ExpressionNode rhs;

    public Print(ExpressionNode printer) {
        System.out.println(printer);
    }

    public  List<Machine.Instruction> emit(){


        return (java.util.List<Machine.Instruction>) rhs;
    }

    public void infixDisplay() {
        System.out.println( rhs + "is equal to");

    }

    public void execute(Map<String,Integer> symTab) {
        String result = rhs + " = " ;
        System.out.println(result);
        System.out.println(symTab);
    }
}
