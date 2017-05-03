package ua.skillsup.java0.practice4.operators;

/**
 * @author Anton Chernetskij
 */
public interface Operator {

    Operator PLUS = new Addition();
    Operator MULTIPLY = new Multiplication();
    Operator POWER = new Power();

    double apply(double leftOperand, double rightOperand);
}
