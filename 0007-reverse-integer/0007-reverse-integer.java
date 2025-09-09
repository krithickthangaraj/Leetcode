class Solution {
    public int reverse(int x) {
        boolean neg=x<0;
        String s=String.valueOf(Math.abs(x));
        StringBuilder in=new StringBuilder(s).reverse();
        try{
            if(neg) return -Integer.parseInt(in.toString());
            else return Integer.parseInt(in.toString());
        }
        catch(NumberFormatException e) 
        {
            return 0;
        }
    }
}