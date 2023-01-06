package dendron.tree;

import dendron.machine.Machine;

import java.util.Collection;
import java.util.List;
import java.util.Map;

public class UnaryOperation implements ExpressionNode {

    public static final String NEG = "_";
    public static final String SQRT = "#";


    public static final Collection<String> OPERATORS = null;

    String operator;
    ExpressionNode expr;

    public UnaryOperation(String operator, ExpressionNode expr) {
        if(OPERATORS.contains(operator) && expr != null){
            this.operator = operator;
            this.expr = expr;
        }

    }

    public void infixDisplay() {
        System.out.println(expr + " "+ operator + " " );
    }

    @Override
    public List<Machine.Instruction> emit() {
        return null;
    }

    public void evaluate(Map<String,Integer> symTab) {
        System.out.println(symTab);
    }
}
