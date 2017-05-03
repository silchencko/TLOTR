package ua.skillsup.java0.practice4.operators;

/**
 * @author Anton Chernetskij
 */
public class Power implements Operator {
    @Override
    public double apply(double leftOperand, double rightOperand) {
        return Math.pow(leftOperand, rightOperand);
    }
}
