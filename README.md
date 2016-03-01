# maze

Simple exercise of solving a maze

Given a matrix of black and white blocks, where we can move into the white block but
we cannot move to the black bock

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

You need to implement the method canMove

```java
@Override
public boolean canMoveBetweenPointsOnMaze(Maze maze, int startX, int startY, int endX, int endY) {

    //Implement your method here
    
}
```
Where given the coordinates of the start point **s=(startX,startY)** and **e=(endX,endY)** the method returns 
true if there is a path between **s** and **e**. False otherwise
