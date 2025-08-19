class Solution {
    public static int MOD = 1000000007;

    public int numberOfPermutations(int n, int[][] requirements) {
        Arrays.sort(requirements, (a, b) -> a[0] - b[0]);
        int idx = 0;
        int[] req = requirements[idx++];
        int[] inv = new int[req[1] + 1];
        inv[0] = 1;
        long r = 1;
        for (int i = 0; i < n; i++) {
            update(inv, i + 1);
            if (i == req[0]) {
                r = (r * inv[inv.length - 1]) % MOD;
                final int old = req[1];
                if (idx < requirements.length) {
                    req = requirements[idx++];
                    inv = new int[req[1] - old + 1];
                    inv[0] = 1;
                }
            }
        }
        return (int) (r);
    }

    static void update(int[] cnt, int maxinv) {
        long window = 0;
        for (int i = Math.max(0, cnt.length - maxinv); i < cnt.length; i++) {
            window += cnt[i];
        }
        for (int i = cnt.length - 1; i >= 0; i--) {
            final int v = (int) (window % MOD);
            window -= cnt[i];
            if (i >= maxinv) {
                window += cnt[i - maxinv];
            }
            cnt[i] = v;
        }
    }
}