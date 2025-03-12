class Solution {
    public int maximumCount(int[] nums) {
        int arr[]=new int[2];
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0) arr[0]++;
            else if(nums[i]>0) arr[1]++;
        }
        return Math.max(arr[0],arr[1]);
    }
}