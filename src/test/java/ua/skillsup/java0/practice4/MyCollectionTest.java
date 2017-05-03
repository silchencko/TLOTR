package ua.skillsup.java0.practice4;

import org.junit.Test;
import ua.skillsup.java0.practice3.Circle;
import ua.skillsup.java0.practice3.Rectangle;
import ua.skillsup.java0.practice3.Shape;

/**
 * @author Anton Chernetskij
 */
public class MyCollectionTest {
    @Test
    public void testIterator() throws Exception {
        MyCollection collection = new MyCollection(new Shape[]{new Circle(1, 2, 3), new Rectangle(2, 3, 4, 5), new Circle(3, 4, 5)});
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()){
            iterator.next().draw();
        }

    }
}
