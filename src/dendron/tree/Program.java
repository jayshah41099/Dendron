package dendron.tree;

import dendron.machine.Machine;

import java.util.List;
import java.util.Map;

public class Program implements ActionNode {

    ActionNode rhs;

    public void addAction(ActionNode newNode) {
        this.addAction(newNode);
    }

    public List<Machine.Instruction> emit(){


        return (List<Machine.Instruction>) rhs;
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
