package dendron.tree;

import dendron.machine.Machine;

import java.util.List;
import java.util.Map;

public class Variable implements ExpressionNode {

    String name;


    public Variable(String name) {
        this.name = name;
    }

    public void infixDisplay() {
        System.out.println(name);
    }

    @Override
    public List<Machine.Instruction> emit() {
        return null;
    }

    public void evaluate(Map<String,Integer> symTab) {
        System.out.println(symTab);
    }


}
