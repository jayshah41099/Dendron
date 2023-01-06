package dendron.tree;

import dendron.machine.Machine;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

public abstract class Constant implements ExpressionNode {
    int value;
    private ExpressionNode rhs;


    public Constant(int value) {
        this.value = value;
    }

    public void infixDisplay() {
        System.out.println(value);
    }


    /**
     *
     * @param
     * @return

    public int evaluate​(Map<String,Integer> symTab) {

        return symTab.get(value);
    }
    */

    public List<Machine.Instruction> emit() {

        return (List<Machine.Instruction>) rhs  ;

     }

    /**
     *
     * @param symTab symbol table, if needed, to fetch variable values

    @Override
    public void evaluate(Map<String, Integer> symTab) {
        System.out.println(symTab);
    }
     */
}