class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int l=0,r=0;
        double max=Double.NEGATIVE_INFINITY;
        double sum=0;
        while(r<nums.length){
            sum+=nums[r];
            
            if(r-l+1==k){
                max=Math.max(max,(double)sum/k);
                sum-=nums[l];
                l++;
            }
            r++;
        }
        return max;
        
    }
}