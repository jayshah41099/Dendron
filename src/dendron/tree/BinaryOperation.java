package dendron.tree;

import dendron.machine.Machine;

import java.util.*;

public class BinaryOperation implements ExpressionNode {

    public String operator;
    public ExpressionNode leftChild;
    public ExpressionNode rightChild;

    public static final String ADD = "+";
    public static final String DIV = "/";
    public static final String MUL = "*";
    public static final String SUB = "-";

    public static final Collection<String> OPERATORS = null ;


    public BinaryOperation(String operator, ExpressionNode leftChild, ExpressionNode rightChild){
        if(OPERATORS.contains(operator) && leftChild != null && rightChild !=null){
            this.operator = operator;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }

    }
    public void infixDisplay() {
        System.out.println(leftChild + " "+ operator + " " + rightChild);
    }

    public void evaluate(Map<String,Integer> symTab) {
        System.out.println(symTab);

    }

    public List<Machine.Instruction> emit(){

        return (List<Machine.Instruction>) leftChild;

    }




}

