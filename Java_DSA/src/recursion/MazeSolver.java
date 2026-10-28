package recursion;

import java.util.Scanner;

public class MazeSolver {

    static boolean solveMaze(int[][] maze, int[][] path, int row, int col, int n) {
        if (row < 0 || col < 0 || row >= n || col >= n
                || maze[row][col] == 0 || path[row][col] == 1) {
            return false;
        }

        if (row == n - 1 && col == n - 1) {
            path[row][col] = 1;
            return true;
        }

        path[row][col] = 1;

        if (solveMaze(maze, path, row - 1, col, n)
                || solveMaze(maze, path, row + 1, col, n)
                || solveMaze(maze, path, row, col - 1, n)
                || solveMaze(maze, path, row, col + 1, n)) {
            return true;
        }

        path[row][col] = 0;
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter maze size: ");
        int n = sc.nextInt();

        int[][] maze = new int[n][n];
        int[][] path = new int[n][n];

        System.out.println("Enter maze (1 = open, 0 = obstacle):");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                maze[i][j] = sc.nextInt();
            }
        }

        if (maze[0][0] == 0 || maze[n - 1][n - 1] == 0) {
            System.out.println("No path exists.");
        } else if (solveMaze(maze, path, 0, 0, n)) {
            System.out.println("Path (1 = path, 0 = not in path):");

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(path[i][j] + " ");
                }
                System.out.println();
            }
        } else {
            System.out.println("No path exists.");
        }

        sc.close();
    }
}
