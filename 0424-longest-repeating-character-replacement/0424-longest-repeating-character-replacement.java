class Solution {
    public int characterReplacement(String s, int k) {
        int l=0,r=0,max=0;
        int maxfreq=0;
        HashMap<Character,Integer> in=new HashMap<>();
        while(r<s.length())
        {
            char ch=s.charAt(r);
            in.put(ch,in.getOrDefault(ch,0)+1);
            maxfreq=Collections.max(in.values());

            if(r-l+1 - maxfreq>k)
            {
                char left=s.charAt(l);
                in.put(left,in.get(left)-1);
                l++;
            }
            max=Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}