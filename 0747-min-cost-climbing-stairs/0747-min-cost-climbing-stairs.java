class Solution {
    public int solve(int i,int[] a,int[]ne){
        int n=a.length;
        if(i>=n) return 0;
        if(ne[i]!=-1) return ne[i];
        return ne[i]=a[i]+Math.min(solve(i+1,a,ne),solve(i+2,a,ne));
    }
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
        int a[]=new int[n+1];
        Arrays.fill(a,-1);

        return Math.min(solve(0,cost,a),solve(1,cost,a));
        
    }
}