class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> in=new HashSet<>();
        int l=0,r=0,max=0;
        while(r<s.length()){
            char n=s.charAt(r);
            
            while(in.contains(n)){
                in.remove(s.charAt(l));
                l++;
            }
            in.add(n);
            max=Math.max(max,(r-l)+1);
            r++;
        }
        return max;
    }
}
        