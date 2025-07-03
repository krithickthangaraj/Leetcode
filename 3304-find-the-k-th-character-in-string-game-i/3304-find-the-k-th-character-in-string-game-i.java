class Solution {
    public char sample(String ch,int k){
        if(ch.length()>=k) return ch.charAt(k-1);
        String str="";
        for(int i=0;i<ch.length();i++)
        {
            str+=((char) (ch.charAt(i)+1));
        }
        return (sample(ch+str,k));
    }

    
    public char kthCharacter(int k) {
        return sample("a",k);
       
    }
}