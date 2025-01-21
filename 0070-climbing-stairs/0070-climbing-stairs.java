class Solution {
    public int solve(int n,int[] a){
        if(n==2 || n==1) return n;
        //if(a[n]!=-1) return a[n];
        //return a[n]=solve(n-1,a)+solve(n-2,a);

        a[1]=1;
        a[2]=2;
        for(int i=3;i<=n;i++){
            a[i]=a[i-1]+a[i-2];
        }
        return a[n];

    }
    public int climbStairs(int n) {
        int a[]=new int[n+1];
        Arrays.fill(a,-1);
        return solve(n,a);
        
    }
}