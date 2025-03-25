class Solution {
    public int cal(int[] nums, int k){
        int l=0,r=0,sum=0,c=0;
        if (k < 0) return 0; 

        while(r<nums.length)
        {
            if(nums[r]%2!=0){
                c++;
            }
            while(c>k)
            {
               if(nums[l]%2!=0){
                c--;
                
               } 
               l++;
            }
            sum+=r-l+1;
            r++;

        }
        return sum;
    }
    public int numberOfSubarrays(int[] nums, int k) {
        return cal(nums,k)-cal(nums,k-1);

           
    }
}