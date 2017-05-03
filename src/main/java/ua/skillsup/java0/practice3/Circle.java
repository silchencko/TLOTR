package ua.skillsup.java0.practice3;

/**
 * Created by ricky on 24.03.17.
 */
public class Circle extends Shape{
    private int r;
    private String color;

    public Circle(int r) {
        this.r = r;
    }

    public Circle(int x, int y, int r) {
        super(x, y);
        this.r = r;
    }

    @Override
    public void draw() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return super.toString() + "Circle{" +
                "r=" + r +
                '}';
    }

    public int getR() {
        return r;
    }

    //    @Override
//    public int compareTo(Object o) {
//        Circle c = (Circle)o;
////        if (c.r < r){
////            return +1;
////        } else if (c.r == r) {
////            return 0;
////        } else {
////            return -1;
////        }
////        return Double.compare(c.r, r);
//        return r - c.r;
//    }
}
