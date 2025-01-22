class Solution {
    public int solve(int i, int j, int n, List<List<Integer>> tri, int[][] dp) {
        if (i == n - 1) {
            return tri.get(i).get(j);
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        int down = solve(i + 1, j, n, tri, dp);
        int diagonal = solve(i + 1, j + 1, n, tri, dp);

        return dp[i][j] = tri.get(i).get(j) + Math.min(down, diagonal);
    }

    public int minimumTotal(List<List<Integer>> tri) {
        int n = tri.size();

        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dp[i], -1);
        }

        return solve(0, 0, n, tri, dp);
    }
}
