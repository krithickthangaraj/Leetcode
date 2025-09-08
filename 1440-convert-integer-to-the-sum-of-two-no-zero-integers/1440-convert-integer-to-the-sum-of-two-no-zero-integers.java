class Solution {

    public boolean containsZero(int num){
        while(num>0){
            int sum=num%10;
            if(sum==0) return false;
            num/=10;
        }
        return true;

    }
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<n;i++)
        {
            if(containsZero(i) && containsZero(n-i)) return new int[]{i,n-i};
        }
        return new int[] {};
    }

}