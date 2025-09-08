class Solution {
    public void swap(int l,int r, int[] nums){
        int temp=nums[l];
        nums[l]=nums[r];
        nums[r]=temp;
    }
    public void sortColors(int[] nums) {
        int l=0,r=0;
        int p=0;

        while(l<nums.length){
            while(r<nums.length &&nums[r]!=p) r++;
            if(r<nums.length){
                swap(l,r,nums);
                l++;
                r++;
                
            }
            
            if(r>=nums.length) {
                p++;
                r=l;
            }

        }
    }
}