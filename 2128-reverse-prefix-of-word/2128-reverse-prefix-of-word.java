class Solution {
    public String reversePrefix(String word, char ch) {
        int index=word.indexOf(ch);
        if(index==-1) return word ;
        StringBuilder in=new StringBuilder(word.substring(0,index+1));
        in.reverse();
        return (in.toString()+word.substring(index+1));
    }
}