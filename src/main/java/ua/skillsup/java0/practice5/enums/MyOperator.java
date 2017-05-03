package ua.skillsup.java0.practice5.enums;

import ua.skillsup.java0.practice4.operators.Operator;

/**
 * @author Anton Chernetskij
 */
public enum MyOperator implements Operator {
    PLUS{
        @Override
        public double apply(double leftOperand, double rightOperand) {
            return leftOperand + rightOperand;
        }
    }, MINUS{
        @Override
        public double apply(double leftOperand, double rightOperand) {
            return leftOperand - rightOperand;
        }
    };

    public static void main(String[] args) {
        System.out.println(PLUS.apply(1,2));
        System.out.println(PLUS.ordinal());
        System.out.println(MINUS.ordinal());
    }
}
