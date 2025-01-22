class Solution {
    public int solve(int i,int j,int m,int n,int[][] grid,int[][] dp ){
        if(i==m||j==n) return 0;
        if(grid[i][j]==1) return 0;
        if(i==m-1 && j==n-1) return 1;
        if(dp[i][j]!=0) return dp[i][j];
        return dp[i][j]=solve(i+1,j,m,n,grid,dp)+solve(i,j+1,m,n,grid,dp);
        

    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int[][] dp=new int[m][n];
        return solve(0,0,m,n,grid,dp);

        
    }
}