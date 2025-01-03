class Solution {
    public String convertToBase7(int num) {
        
        if(num==0)
        {
            return "0";
        }
        boolean isNeg=num<0;
        num=Math.abs(num);

        StringBuilder in=new StringBuilder();
        while(num>0)
        {
            int rem=num%7;
            in.append(rem);
            num/=7;
            
        }
        if(isNeg)
        {
            in.append("-");
        }
        

        return in.reverse().toString();
        
    }
}