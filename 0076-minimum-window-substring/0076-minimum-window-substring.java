class Solution {
    public String minWindow(String s, String t) {
        int l=0,r=0,c=0;
        String min="";
        int len = Integer.MAX_VALUE; 
        HashMap<Character,Integer> in=new HashMap<>();
        HashMap<Character,Integer> hm=new HashMap<>();

        for(char i: t.toCharArray()){
        in.put(i, in.getOrDefault(i, 0) + 1);
        }

        while(r<s.length()){
            char ch=s.charAt(r);

            if(in.containsKey(ch))
            {
                hm.put(ch, hm.getOrDefault(ch, 0) + 1);

                if (hm.get(ch).equals(in.get(ch))) c++;
            }


            while(c==in.size())
            {
                if(len>r-l+1)
                {
                    min=s.substring(l,r+1);
                    len=r-l+1;
                }
                char left=s.charAt(l);

                if(in.containsKey(left) && hm.containsKey(left) )
                { 
        
                        hm.put(left, hm.get(left)- 1);

                    if (hm.get(left)<in.get(left)) c--;

                    if (hm.get(left) == 0) hm.remove(left);
                }
                l++;
            }
        
            r++;
        }
        
        return min;

    }
}