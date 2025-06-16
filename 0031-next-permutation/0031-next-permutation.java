class Solution {
    public void nextPermutation(int[] nums) {
        int a=-1,b=-1;
        for(int i=nums.length-1;i>=1;i--){
            if(nums[i-1]<nums[i]){
                a=i-1;
                break;
            }
        }
        if (a == -1) {
            reverse(nums, 0, nums.length - 1);
            return;
        }

        for(int j=nums.length-1;j>=1;j--){
            if(nums[a]<nums[j]){
                b=j;
                break;
            }
        }
        int temp=nums[a];
        nums[a]=nums[b];
        nums[b]=temp;

        reverse(nums, a + 1, nums.length - 1);
    }
        
      
    public void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}