class Solution {
    public int solve(int n,int[] a){
        if(n==0 || n==1 ) return n;
        if(n==2) return 1;
        if(a[n]!=-1) return a[n];
        return a[n]=solve(n-1,a)+solve(n-2,a)+solve(n-3,a);
    }
    public int tribonacci(int n) {
         int a[]=new int[n+1];
         Arrays.fill(a,-1);
         return solve(n,a);
        
    }
}