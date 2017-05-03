package ua.skillsup.java0.practice4;

import ua.skillsup.java0.practice4.expression.ComplexExpression;
import ua.skillsup.java0.practice4.expression.Constant;

import static ua.skillsup.java0.practice4.operators.Operator.*;

/**
 * @author Anton Chernetskij
 */
public class ExpressionsTest {
    public static void main(String[] args) {
        ComplexExpression expression = new ComplexExpression(constant(2), constant(2), PLUS);
        System.out.println(expression.evaluate());

        ComplexExpression expression1 = new ComplexExpression(expression, new Constant(1/2), POWER);
        System.out.println(expression1.evaluate());


    }

    public static Constant constant(double value){
        return new Constant(value);
    }
}
