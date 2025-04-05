class Solution {
    public int findMaxFish(int[][] grid1) {
         int ans=0;
        int r=grid1.length;
        int c=grid1[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(grid1[i][j]>0){
                    ans=Math.max(ans,dfs(i,j,grid1));
                }
            }
        }
        return ans;
    }

    private int dfs(int r ,int c, int[][]grid1){
        if(r<0 || c<0 ||r>=grid1.length||c >= grid1[0].length || grid1[r][c] == 0){
            return 0;
        }
        int res = grid1[r][c];
        grid1[r][c] = 0;
        res +=dfs(r-1,c,grid1);
        res +=dfs(r,c-1,grid1);
        res +=dfs(r+1,c,grid1);
        res +=dfs(r,c+1,grid1);
        return res;
    }
}