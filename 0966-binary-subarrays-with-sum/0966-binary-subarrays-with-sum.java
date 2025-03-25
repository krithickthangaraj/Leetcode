class Solution {
    public int cal(int[] nums, int goal){
        int l=0,r=0,sum=0,c=0;
        if (goal < 0) return 0; 

        while(r<nums.length)
        {
            
            sum+=nums[r];
            
            while(sum>goal ){
                sum-=nums[l];
                l++;
            }
             c+=r-l+1;

            r++;

        }
        return c;
    }
    public int numSubarraysWithSum(int[] nums, int goal) {
        return cal(nums,goal)-cal(nums,goal-1);
        
    }
}