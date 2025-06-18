class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer,Integer> in=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            in.put(nums[i],i);
        }
        for(int i=0;i<nums.length;i++){
            if(in.containsKey(t-nums[i])&& in.get(t-nums[i]) != i){
                return new int[]{i,in.get(t-nums[i])};
            }
        }
        return new int []{};
    }
}