package ua.skillsup.java0.practice4.expression;

/**
 * @author Anton Chernetskij
 */
public class Constant implements Expression {
    private double value;

    public Constant(double value) {
        this.value = value;
    }

    @Override
    public double evaluate() {
        return value;
    }
}
