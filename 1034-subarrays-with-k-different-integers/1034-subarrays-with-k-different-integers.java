
class Solution {
    public int cal(int[]nums,int k){
HashMap<Integer, Integer> in = new HashMap<>();
        int l = 0, r = 0, c = 0;
        if (k <= 0) return 0;  

        while (r < nums.length) {
            in.put(nums[r], in.getOrDefault(nums[r], 0) + 1);

            

            while (in.size() > k) {
                in.put(nums[l], in.get(nums[l]) - 1);
                if (in.get(nums[l]) == 0) {
                    in.remove(nums[l]);
                }
                l++;
            }
            if (in.size() <= k) {
                c+=r-l+1;
            }
            r++;
        }
        return c;
    }
    public int subarraysWithKDistinct(int[] nums, int k) {
        return cal(nums,k)-cal(nums,k-1);
    }
}
