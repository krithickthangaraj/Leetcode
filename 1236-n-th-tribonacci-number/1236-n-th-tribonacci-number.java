class Solution {
    public int solve(int n,int[] a){
        if(n==0 || n==1 ) return n;
        if(n==2) return 1;
        //if(a[n]!=-1) return a[n];
        //return a[n]=solve(n-1,a)+solve(n-2,a)+solve(n-3,a);
        a[0]=0;
        a[1]=1;
        a[2]=1;
        for(int i=3;i<=n;i++){
            a[i]=a[i-1]+a[i-2]+a[i-3];
        }
        return a[n];
    }
    public int tribonacci(int n) {
         int a[]=new int[n+1];
         Arrays.fill(a,-1);
         return solve(n,a);
        
    }
}