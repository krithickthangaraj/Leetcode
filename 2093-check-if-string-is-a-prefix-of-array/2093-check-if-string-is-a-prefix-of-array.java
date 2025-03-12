class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String str="";
        for(String i:words){
            str+=i;
            if(str.equals(s)) return true;
            if(str.length()>s.length()) return false;
        }
        return false;
        
    }
}