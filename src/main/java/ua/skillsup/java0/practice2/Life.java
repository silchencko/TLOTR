package ua.skillsup.java0.practice2;

/**
 * https://en.wikipedia.org/wiki/Conway%27s_Game_of_Life
 * https://bitstorm.org/gameoflife/
 * <p/>
 * Any live cell with fewer than two live neighbours dies, as if caused by underpopulation.
 * Any live cell with two or three live neighbours lives on to the next generation.
 * Any live cell with more than three live neighbours dies, as if by overpopulation.
 * Any dead cell with exactly three live neighbours becomes a live cell, as if by reproduction.
 */
public class Life {
    public boolean[][] computeNextState(boolean[][] universe) {
        boolean[][] result =
                new boolean[universe.length][universe[0].length];
        for (int i = 0; i < universe.length; i++) {
            boolean[] row = universe[i];
            for (int j = 0; j < row.length; j++) {
                int n = countNeighbours(universe, i, j);
                result[i][j] = checkAlive(universe[i][j], n);
            }
        }
        return result;
    }

    private int countNeighbours(boolean[][] universe, int i, int j) {
        int count = 0;
        for (int k = -1; k <= 1; k++) {
            for (int l = -1; l <= 1; l++) {
                int x = i + k;
                int y = j + l;
                x = correctIndex(x, universe.length);
                y = correctIndex(y, universe[0].length);

                if (universe[x][y] && !(k == 0 && l == 0)) {
                    count++;
                }
            }
        }
        return count;
    }

    private int correctIndex(int index, int bound){
        return (index + bound) % bound;
    }

    private boolean checkAlive(boolean alive, int neighbours) {
        boolean result;
        if (alive) {
            result = !(neighbours < 2 || neighbours > 3);
        } else result = neighbours == 3;
        return result;
    }
}
