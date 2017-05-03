package ua.skillsup.java0.practice2;

import org.junit.Test;

public class LifeTest {
    @Test
    public void testBlock() throws Exception {
        boolean[][] universe = new boolean[10][10];
        universe[4][4] = true;
        universe[4][5] = true;
        universe[5][4] = true;
        universe[5][5] = true;
        execute(universe, 5);
    }

    @Test
    public void testBlinker() throws Exception {
        boolean[][] universe = new boolean[10][10];
        universe[4][3] = true;
        universe[4][4] = true;
        universe[4][5] = true;
        execute(universe, 5);
    }

    @Test
    public void testGlider() throws Exception {
        boolean[][] universe = new boolean[6][15];
        universe[4][3] = true;
        universe[4][4] = true;
        universe[4][5] = true;
        universe[3][5] = true;
        universe[2][4] = true;
        execute(universe, 30);
    }

    private void execute(boolean[][] universe, int steps) throws Exception {
        Life life = new Life();
        for (int i = 0; i < steps; i++) {
            printUniverse(universe);
            universe = life.computeNextState(universe);
            Thread.sleep(500);
        }
    }

    private void printUniverse(boolean[][] universe){
        System.out.println("\n\n\n\n");
        for (int i = 0; i < universe[0].length; i++) {
            System.out.print('_');
        }
        System.out.println();
        for (boolean[] row : universe) {
            for (boolean cell : row) {
                if (cell){
                    System.out.print("#");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.print("|\n");
        }
    }
}
