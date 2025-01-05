class Solution {
    public String shiftingLetters(String s, int[][] shifts) {
        int[] shiftArray = new int[s.length() + 1];

        for (int[] shift : shifts) {
            int start = shift[0];
            int end = shift[1];
            int direction = shift[2] == 1 ? 1 : -1;

            shiftArray[start] += direction;
            shiftArray[end + 1] -= direction;
        }

        int netShift = 0;
        char[] result = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            netShift += shiftArray[i];
         int shiftValue = ((result[i] - 'a' + netShift) % 26 + 26) % 26; 
            result[i] = (char) ('a' + shiftValue);
        }

        return new String(result);
    }
}
