class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        StringBuilder in=new StringBuilder(String.valueOf(x)).reverse();
        int res=0;
        int temp=x;
        while(x>0){
            int seum=x%10;
            res=res*10+seum;
            x/=10;
        }
        return res==temp;
    }
}