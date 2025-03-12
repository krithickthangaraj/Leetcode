class Solution {
    public int lengthOfLongestSubstring(String s) {
        String max="";
        String temp="";

        for(char i:s.toCharArray()){
            if(temp.contains(String.valueOf(i))){
                temp = temp.substring(temp.indexOf(i) +1);
            }
            temp+=i;


            if(temp.length()>max.length())
            {
                max=temp;
            }
        }
        System.out.print(max);
        return max.length();
    }
}