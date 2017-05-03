package ua.skillsup.java0.practice5.generics;

import ua.skillsup.java0.practice3.Circle;
import ua.skillsup.java0.practice3.Rectangle;
import ua.skillsup.java0.practice3.Shape;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Anton Chernetskij
 */
public class MyGenericsTest {

    public static void printShape(List<? extends Shape> list){
        for(Shape element: list){
            System.out.println(element);
        }
    }

    public static void copyShapes(List<? extends Shape> source,
                                  List<? super Shape> destination){
        for (Shape shape: source){
            destination.add(shape);
        }
    }

    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("a", "b");
        List<Circle> circles = Arrays.asList(
                new Circle(1), new Circle(2));
        List<Rectangle> rectangles = Arrays.asList(
                new Rectangle(2, 2), new Rectangle(3, 3));
//        printShape(stringList); not working
        printShape(circles);
        printShape(rectangles);

        List<Shape> shapes = new ArrayList<>();
        copyShapes(circles, shapes);
    }
}
