class Solution {
    public String baseNeg2(int n) {
        if (n == 0) return "0";
        StringBuilder sb = new StringBuilder();

        while (n != 0) {
            int remain = n % -2;
            n /= -2;
            if (remain < 0) {
                remain += 2;
                n += 1;
            }
            sb.append(remain);
        }

        return sb.reverse().toString();
    }
}