package ua.skillsup.java0.practice3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Created by ricky on 24.03.17.
 */
public class ShapeTest {

    public static void main(String[] args) {

        Circle[] c = {new Circle(8), new Circle(10), new Circle(2)};
        Arrays.sort(c, new Comparator<Circle>() {
            @Override
            public int compare(Circle o1, Circle o2) {
                return o1.getR() - o2.getR();
            }
        });
        System.out.println(Arrays.toString(c));

        Rectangle[] r = {new Rectangle(2,6), new Rectangle(3,4), new Rectangle(4, 4)};
        Arrays.sort(r);
        System.out.println(Arrays.toString(r));

        System.out.println("###########");

        Figure figure = new Figure(new Shape[]{new Circle(1), new Rectangle(2, 3)});
//        Iterator iterator = figure.iterator();
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());
//        System.out.println(iterator.next());
//        System.out.println(iterator.hasNext());

        for (Object shape: figure){
            System.out.println(shape);
        }

    }
}
