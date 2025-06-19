class Solution {
    public int minSubArrayLen(int t, int[] nums) {
        int l=0;
        int r=0;
        int sum=0;
        int max=Integer.MAX_VALUE;
        while(r<nums.length){
            sum+=nums[r];
            
            while(sum>=t){
            
                max=Math.min(max,(r-l)+1);
                sum-=nums[l];
                l++;

            }
            r++;

        }
        if(max==Integer.MAX_VALUE) return 0;
        else return max;
    }
}