package ua.skillsup.java0.practice1;

import org.junit.Test;

public class HomeWorkTest {

    @Test
    public void tree1() throws Exception {
        int height = 6;
        int width = (height - 1) * 2;
        String[] tree = new String[width];
        String[] tree1 = new String[width];
        for (int i = 0; i < width; i++) {
            tree[i] = " ";
            tree1[i] = " ";
        }
//        tree[width / 2] = "*";
        tree1[width / 2] = "*";
        for (int i = 0; i < width / 2; i++) {
            tree[width / 2 + i] = "*";
            tree[width / 2 - i] = "*";
            for (String s : tree) {
                System.out.print(s);
            }
            System.out.println();
        }
        for (String s : tree1) {
            System.out.print(s);
        }
    }

    @Test
    public void tree2() throws Exception {
        int count = 6;
        String tree = "";
//        for (int j = count; j > 1; j--) {
        System.out.println(tree);
        for (int i = 1; i <= count; i++) {
            for (int p = 0; p < count - i; p++) {
                System.out.print(" ");
            }
            tree = tree + "*";
            System.out.println(tree);
            tree = tree + "*";
        }
        for (int q = count; q > 1; q--) {
            System.out.print(" ");
        }
        System.out.println("*");
    }

    @Test
    public void tree3() throws Exception {
        int xTreeHeight = 6;
        int startPoint;

        for (int i = 0; i < xTreeHeight; i++) {
            startPoint = xTreeHeight - i;
            if (i == xTreeHeight - 1) {
                startPoint = xTreeHeight;
            }
            for (int j = 0; j <= startPoint + i * 2; j++) {
                if (j < startPoint) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                    if (i == xTreeHeight - 1) {
                        break;
                    }
                }
            }
            System.out.println();
        }

    }

    @Test
    public void tree4() throws Exception {
        int h = 6;
        int width = 2 * (h - 2) + 1;
        for (int i = 0; i < h - 1; i++) {
            int numStars = 2 * i + 1;
            int numSpaces = (width - numStars) / 2;
            for (int j = 0; j < numSpaces; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < numStars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int j = 0; j < h - 2; j++) {
            System.out.print(" ");
        }
        System.out.print("*");
        for (int j = 0; j < h - 2; j++) {
            System.out.print(" ");
        }
    }

    @Test
    public void tree5() throws Exception {
        int l = 0;
        int h = 4;
        while (l + 1 < h) {
            String spaces = "";
            String stars = "";
            for (int j = 0; j < h - l; j++) spaces = spaces + " ";
            for (int j = 0; j < 2 * l + 1; j++) stars += "*";
            System.out.println(spaces + stars);
            l++;
        }
        int p = h - 1;
        while (p < h) {                     //Ножка
            String c = "";
            for (int o = 0; o < h; o++) c = c + " ";
            p++;
            System.out.println(c + "*");
        }
    }

    @Test
    public void brackets() throws Exception {
        String input = "(()))(()()";
        int open = 0;
        int close = 0;
        char[] array = input.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char x = array[i];
            if (x == '(') {
                open++;
            } else if (x == ')') {
                close++;
            }
            if (close > open) {
                System.out.println("Not valid");
                return;
            }
        }
        if (open == close) {
            System.out.println("Valid");
        } else {
            System.out.println("Not valid");
        }
    }

    @Test
    public void star() throws Exception {
        int h = 15;
        int dh = h / 3;
        for (int i = 0; i < h + dh; i++) {
            for (int j = 0; j < 2 * h; j++) {
                boolean triangle1 = j > h - i && j < i + h && i < h;

                int i2 = i - dh;
                boolean triangle2 = j > i2 && j < 2 * h - i2 && i2 > 0;

                if (triangle1 || triangle2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    @Test
    public void name() throws Exception {
        int MIDDLE = 10;
        int a = 0;
        while (a < MIDDLE) {
            int i = 0;
            while (i < MIDDLE - a) {
                System.out.print(" ");
                i++;
            }
            int j = 0;
            while (j < a * 2 + 1) {
                System.out.print("1");
                j++;
            }
            System.out.println();
            a++;
        }

    }
}