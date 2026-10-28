package recursion;

import java.util.Scanner;

public class GraphColoring {

    static boolean isSafe(int vertex, int[][] graph, int[] colors,
                          int color, int n) {
        for (int i = 0; i < n; i++) {
            if (graph[vertex][i] == 1 && colors[i] == color) {
                return false;
            }
        }

        return true;
    }

    static boolean solve(int[][] graph, int[] colors, int vertex,
                         int m, int n) {
        if (vertex == n) {
            return true;
        }

        for (int color = 1; color <= m; color++) {
            if (isSafe(vertex, graph, colors, color, n)) {
                colors[vertex] = color;

                if (solve(graph, colors, vertex + 1, m, n)) {
                    return true;
                }

                colors[vertex] = 0;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter adjacency matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        int[] colors = new int[n];
        boolean found = false;

        for (int m = 1; m <= n; m++) {
            if (solve(graph, colors, 0, m, n)) {
                System.out.println("Minimum colors required: " + m);

                for (int i = 0; i < n; i++) {
                    System.out.println("Vertex " + i + " -> Color " + colors[i]);
                }

                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Coloring not possible.");
        }

        sc.close();
    }
}
