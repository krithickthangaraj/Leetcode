class Solution {
    public int maxScore(int[] arr, int k) {
        int sum=0;
        for(int i=0;i<k;i++) sum+=arr[i];

         int max=sum;
         int l=k-1,r=arr.length-1;

        for(int i=0;i<k;i++)
        {
            
            sum-=arr[l];
            sum+=arr[r];
            max=Math.max(max,sum);
            l--;
            r--;
        }
        return max;
    }
}