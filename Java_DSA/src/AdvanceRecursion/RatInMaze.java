package AdvanceRecursion;


import java.util.*;

public class RatInMaze {

    static void solveMaze(int[][] maze, int row, int col,
                          int[][] path, int n) {

        if (row == n - 1 && col == n - 1) {
            path[row][col] = 1;
            printPath(path, n);
            path[row][col] = 0;
            return;
        }

        if (row < 0 || col < 0 || row >= n || col >= n
                || maze[row][col] == 0 || path[row][col] == 1) {
            return;
        }

        path[row][col] = 1;

        solveMaze(maze, row + 1, col, path, n);
        solveMaze(maze, row, col + 1, path, n);
        solveMaze(maze, row - 1, col, path, n);
        solveMaze(maze, row, col - 1, path, n);

        path[row][col] = 0;
    }

    static void printPath(int[][] path, int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(path[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of maze: ");
        int n = sc.nextInt();

        int[][] maze = new int[n][n];

        System.out.println("Enter maze (1 = open, 0 = blocked):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            System.out.println("No path exists.");
        } else {
            int[][] path = new int[n][n];
            System.out.println("All possible paths:");
            solveMaze(maze, 0, 0, path, n);
        }

        sc.close();
    }
}

