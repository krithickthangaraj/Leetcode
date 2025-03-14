class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,r=0,c=0;
        HashMap<Character,Integer> in=new HashMap<>();
        while(r<s.length())
        {
            char str=s.charAt(r);
            in.put(str,in.getOrDefault(str,0)+1);

            while(in.size()==3){
                c+=s.length()-r;
                char st=s.charAt(l);

                in.put(st,in.get(st)-1);
                
                if(in.get(st)==0) in.remove(st);
                l++;                
            }
            r++;
            }
            return c;
        
    }
}