package ua.skillsup.java0.practice3;

/**
 * Created by ricky on 24.03.17.
 */
public class Rectangle extends Shape implements Comparable {
    private int a;
    private int b;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Rectangle(int x, int y, int a, int b) {
        super(x, y);
        this.a = a;
        this.b = b;
    }


    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Rectangle{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        Rectangle r = (Rectangle) o;
        int s1 = a * b;
        int s2 = r.a * r.b;
        return s1 - s2;
    }
}
