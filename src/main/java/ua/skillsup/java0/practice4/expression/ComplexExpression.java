package ua.skillsup.java0.practice4.expression;

import ua.skillsup.java0.practice4.operators.Operator;

/**
 * @author Anton Chernetskij
 */
public class ComplexExpression implements Expression{
    private Expression leftOperand, rightOperand;
    private Operator operator;

    public ComplexExpression(Expression leftOperand, Expression rightOperand, Operator operator) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
        this.operator = operator;
    }

    @Override
    public double evaluate() {
        return operator.apply(leftOperand.evaluate(), rightOperand.evaluate());
    }
}
