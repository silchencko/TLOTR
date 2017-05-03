package ua.skillsup.java0.practice4;

import ua.skillsup.java0.practice3.Shape;

/**
 * @author Anton Chernetskij
 */
public class MyCollection {
    private Shape[] shapes;

    public MyCollection(Shape[] shapes) {
        this.shapes = shapes;
    }

    public Iterator getIterator(){
        return new Iterator() {
            int position = 0;

            @Override
            public boolean hasNext() {
                return position < shapes.length;
            }

            @Override
            public Shape next() {
                return shapes[position++];
            }
        };
    }


    void printAll(Iterator iterator){

    }
}
