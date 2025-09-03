class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int ans = nums[0];

        int prefix = 1, suffix = 1;

        for (int i = 0; i < n; i++) {
            // prefix product
            prefix = (prefix == 0 ? 1 : prefix) * nums[i];
            ans = Math.max(ans, prefix);

            // suffix product
            suffix = (suffix == 0 ? 1 : suffix) * nums[n - 1 - i];
            ans = Math.max(ans, suffix);
        }

        return ans;
    }
}
