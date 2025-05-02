class Solution {
    public String pushDominoes(String s) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int left = 0;

        char[] result = new char[n];
        for (int i = 0; i < n; i++) result[i] = arr[i];

        int i = 0;
        while (i < n) {
            if (arr[i] == '.') {
                int j = i;
                while (j < n && arr[j] == '.') j++;

                char leftChar = (i == 0) ? 'L' : arr[i - 1];
                char rightChar = (j == n) ? 'R' : arr[j];

                if (leftChar == rightChar) {
                    for (int k = i; k < j; k++) result[k] = leftChar;
                } else if (leftChar == 'R' && rightChar == 'L') {
                    int l = i, r = j - 1;
                    while (l < r) {
                        result[l++] = 'R';
                        result[r--] = 'L';
                    }
                }

                i = j;
            } else {
                i++;
            }
        }

        return new String(result);
    }
}
