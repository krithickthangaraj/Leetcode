class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> in=new HashSet<>();
        int l=0,r=0,max=0;
        while(r<s.length())
        {
           if(!in.contains(s.charAt(r))){
            in.add(s.charAt(r));
            max=Math.max((r-l)+1,max);
            r++;
           }
           else{
            in.remove(s.charAt(l));
            l++;
           }
        }
        return max;
    }
}