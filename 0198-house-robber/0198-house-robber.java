class Solution {
    public int solve(int i,int[]num,int[]a){
        int n=num.length;
        if(i>=n) return 0;
        if(a[i]!=-1) return a[i];
        return a[i]=Math.max(num[i]+solve(i+2,num,a),solve(i+1,num,a));


    }
    public int rob(int[] nums) {
        int a[]=new int[nums.length+1];
        Arrays.fill(a,-1);
        
        return solve(0,nums,a);        
    }
}