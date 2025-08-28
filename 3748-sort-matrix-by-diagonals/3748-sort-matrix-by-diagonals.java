import java.util.*;

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        Map<Integer, Queue<Integer>> diagonals = new HashMap<>();

        // Step 1: Store diagonals using appropriate heaps
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = i - j;
                // Use min-heap for top-right diagonals, max-heap for bottom-left
                diagonals.putIfAbsent(d, d < 0 ? new PriorityQueue<>() : new PriorityQueue<>(Collections.reverseOrder()));
                diagonals.get(d).add(grid[i][j]);
            }
        }

        // Step 2: Refill grid with sorted values
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int d = i - j;
                grid[i][j] = diagonals.get(d).poll();
            }
        }

        return grid;
    }
}
