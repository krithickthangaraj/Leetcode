class Solution {
    public int minimumRecolors(String blocks, int k) {
        int minRecolors = Integer.MAX_VALUE;
        int whiteCount = 0;

        // Initial count of 'W' in the first window of size k
        for (int i = 0; i < k; i++) {
            if (blocks.charAt(i) == 'W') {
                whiteCount++;
            }
        }
        minRecolors = whiteCount;

        // Sliding window
        for (int i = k; i < blocks.length(); i++) {
            if (blocks.charAt(i - k) == 'W') {
                whiteCount--; // Remove leftmost element
            }
            if (blocks.charAt(i) == 'W') {
                whiteCount++; // Add new element
            }
            minRecolors = Math.min(minRecolors, whiteCount);
        }
        return minRecolors;
    }
}
