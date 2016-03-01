package core;


public class Maze {

    private final boolean cells[][];
    private final int width;
    private final int height;

    public Maze(boolean[][] blackCells, int width, int height) {
        this.cells = blackCells;
        this.width = width;
        this.height = height;
    }

    /**
     * Returns true if the cell in the maze at x,y is empty (marked as true)
     */

    public boolean canMoveInto(int x, int y) {
        if(x < 0 || x >= width || y < 0 || y >= height) {
            return false;
        }
        return cells[x][y];
    }

    public void  markBlock(int x, int y) {
        cells[x][y] = false;
    }
}
