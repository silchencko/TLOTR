package ua.skillsup.java0.practice5.enums;

import java.util.Arrays;

/**
 * @author Anton Chernetskij
 */
public enum Color {
    RED(100, 0, 0),
    GREEN(0, 100, 0),
    BLUE(0, 0, 100),
    YELLOW(0, 50, 50);
    private int red, green, blue;

    private Color(int red, int green, int blue) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public void draw(){
        System.out.println("" + red + " " + green + " " + blue);
    }

    @Override
    public String toString() {
        return super.toString() +
                "(" + red +
                "," + green +
                "," + blue +
                ')';
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(Color.values()));
    }
}
