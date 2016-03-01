package core;


import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class MazeTest {

    @Test
    public void checkPathTrue() {

        /**     0   1   2   3   4
         *    ┌───┬───┬───┬───┬───┐
         *  0 │   │▒▒▒│e0 │   │s0 │
         *    ├───┼───┼───┼───┼───┤
         *  1 │   │▒▒▒│▒▒▒│▒▒▒│▒▒▒│
         *    ├───┼───┼───┼───┼───┤
         *  2 │   │   │   │   │   │
         *    ├───┼───┼───┼───┼───┤
         *  3 │▒▒▒│   │▒▒▒│   │   │
         *    ├───┼───┼───┼───┼───┤
         *  4 │   │   │▒▒▒│   │   │
         *    └───┴───┴───┴───┴───┘
         */

        boolean cells[][] = new boolean[5][5];

        setUpCells(cells, 5, 5);
        cells[0][3] = false;
        cells[1][0] = false;
        cells[1][1] = false;
        cells[2][1] = false;
        cells[2][3] = false;
        cells[2][4] = false;
        cells[3][1] = false;
        cells[4][1] = false;

        Maze maze = new Maze(cells, 5, 5);

        MazeSolverImpl solver = new MazeSolverImpl();
        assertTrue(solver.canMoveBetweenPointsOnMaze(maze, 4, 0, 2, 0));
    }

    @Test
    public void checkPathTrue2() {

        /**     0   1   2   3   4
         *    ┌───┬───┬───┬───┬───┐
         *  0 │s0 │▒▒▒│   │   │   │
         *    ├───┼───┼───┼───┼───┤
         *  1 │   │▒▒▒│▒▒▒│▒▒▒│▒▒▒│
         *    ├───┼───┼───┼───┼───┤
         *  2 │   │   │   │   │   │
         *    ├───┼───┼───┼───┼───┤
         *  3 │▒▒▒│   │▒▒▒│   │   │
         *    ├───┼───┼───┼───┼───┤
         *  4 │   │   │▒▒▒│   │e0 │
         *    └───┴───┴───┴───┴───┘
         */

        boolean cells[][] = new boolean[5][5];

        setUpCells(cells, 5, 5);
        cells[0][3] = false;
        cells[1][0] = false;
        cells[1][1] = false;
        cells[2][1] = false;
        cells[2][3] = false;
        cells[2][4] = false;
        cells[3][1] = false;
        cells[4][1] = false;

        Maze maze = new Maze(cells, 5, 5);

        MazeSolverImpl solver = new MazeSolverImpl();
        assertTrue(solver.canMoveBetweenPointsOnMaze(maze, 0, 0, 4, 4));
    }

    @Test
    public void checkPathFalse() {

        /**     0   1   2   3   4
         *    ┌───┬───┬───┬───┬───┐
         *  0 │   │▒▒▒│s0 │   │   │
         *    ├───┼───┼───┼───┼───┤
         *  1 │   │▒▒▒│▒▒▒│▒▒▒│▒▒▒│
         *    ├───┼───┼───┼───┼───┤
         *  2 │   │   │   │   │   │
         *    ├───┼───┼───┼───┼───┤
         *  3 │▒▒▒│   │▒▒▒│   │   │
         *    ├───┼───┼───┼───┼───┤
         *  4 │   │   │▒▒▒│   │e0 │
         *    └───┴───┴───┴───┴───┘
         */

        boolean cells[][] = new boolean[5][5];

        setUpCells(cells, 5, 5);
        cells[0][3] = false;
        cells[1][0] = false;
        cells[1][1] = false;
        cells[2][1] = false;
        cells[2][3] = false;
        cells[2][4] = false;
        cells[3][1] = false;
        cells[4][1] = false;

        Maze maze = new Maze(cells, 5, 5);

        MazeSolverImpl solver = new MazeSolverImpl();
        assertFalse(solver.canMoveBetweenPointsOnMaze(maze, 2, 0, 4, 4));
    }

    @Test
    public void checkStartEndSamePoint() {

        /**     0   1   2   3   4
         *    ┌───┬───┬───┬───┬───┐
         *  0 │   │▒▒▒│   │   │   │
         *    ├───┼───┼───┼───┼───┤
         *  1 │   │▒▒▒│▒▒▒│▒▒▒│▒▒▒│
         *    ├───┼───┼───┼───┼───┤
         *  2 │   │   │   │   │   │
         *    ├───┼───┼───┼───┼───┤
         *  3 │▒▒▒│   │▒▒▒│   │   │
         *    ├───┼───┼───┼───┼───┤
         *  4 │   │   │▒▒▒│   │se0│
         *    └───┴───┴───┴───┴───┘
         */


        boolean cells[][] = new boolean[5][5];

        setUpCells(cells, 5, 5);
        cells[0][3] = false;
        cells[1][0] = false;
        cells[1][1] = false;
        cells[2][1] = false;
        cells[2][3] = false;
        cells[2][4] = false;
        cells[3][1] = false;
        cells[4][1] = false;

        Maze maze = new Maze(cells, 5, 5);

        MazeSolverImpl solver = new MazeSolverImpl();
        assertTrue(solver.canMoveBetweenPointsOnMaze(maze, 3, 3, 3, 3));
    }

    private void setUpCells(boolean[][] cells, int x, int y) {
        for(int i = 0; i < x; i++) {
            for(int j = 0; j < y; j++) {
                cells[i][j] = true;
            }
        }
    }
}
