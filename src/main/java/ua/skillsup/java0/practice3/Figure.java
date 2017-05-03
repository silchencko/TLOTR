package ua.skillsup.java0.practice3;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author Anton Chernetskij
 */
public class Figure extends Shape implements Iterable{
    private Shape[] shapes;

    public Figure(Shape[] shapes) {
        this.shapes = shapes;
    }

    @Override
    public void draw() {
        System.out.println("x:" + getX() + ", y:" + getY());
        for (Shape shape : shapes) {
            shape.draw();
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Figure figure = (Figure) o;

        if (!Arrays.equals(shapes, figure.shapes)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return shapes != null ? Arrays.hashCode(shapes) : 0;
    }

    @Override
    public Iterator iterator() {
//        return new Iterator() {
//            @Override
//            public boolean hasNext() {
//                return false;
//            }
//
//            @Override
//            public Object next() {
//                return null;
//            }

//            @Override
//            public void remove() {
//                //not implemented
//            }
//
//            @Override
//            public void forEachRemaining(Consumer action) {
//
//            }
//        };
        class MyIterator implements Iterator{
            private int index;

            @Override
            public boolean hasNext() {
                return index < shapes.length;
            }

            @Override
            public Object next() {
                return shapes[index++];
            }
        }
        return new MyIterator();
    }

    /*@Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof Figure) {
            Figure figure = (Figure) obj;
            if (!(getX() == figure.getX() &&
                    getY() == figure.getY() &&
                    figure.shapes.length == shapes.length)) {
                return false;
            } else {
                for (int i = 0; i < shapes.length; i++) {
                    if (!shapes[i].equals(figure.shapes[i])) {
                        return false;
                    }
                }
                return true;
            }
        } else {
            return false;
        }
    }*/
}
