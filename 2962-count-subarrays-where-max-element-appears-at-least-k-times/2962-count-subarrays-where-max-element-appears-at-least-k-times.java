class Solution {
    public long countSubarrays(int[] nums, int k) {
        int l = 0, r = 0;
        int max = 0;
        long c = 0;
        
        for (int num : nums) {
            max = Math.max(max, num);
        }

        HashMap<Integer, Integer> in = new HashMap<>();

        while (r < nums.length) {
            int n = nums[r];
            in.put(n, in.getOrDefault(n, 0) + 1);

            while (in.getOrDefault(max, 0) >= k) {
                c += nums.length - r;
                
                int ll = nums[l];
                in.put(ll, in.get(ll) - 1);
                if (in.get(ll) == 0) {
                    in.remove(ll);
                }
                l++;
            }
            r++;
        }

        return c;
    }
}
