package ua.skillsup.java0.practice5.generics;

import ua.skillsup.java0.practice3.Circle;
import ua.skillsup.java0.practice3.Shape;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Anton Chernetskij
 */
public class MyGenericClass<T extends Shape> {
    private T shape;

    public MyGenericClass(T shape) {
        this.shape = shape;
    }

    public void combine(T otherShape){
    }
}
