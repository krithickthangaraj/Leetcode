class Solution {
    public int longestOnes(int[] num, int k) {
        int l=0,r=0;
        int max=0,z=0;
        
        while(r<num.length)
        {
            
                if(num[r]==0) z++;
                r++;
                if(z<=k) max=Math.max(max,r-l);
            
            while(z>k){
                if(num[l]==0)  z--;
                    l++;
                
            }
        }
        return max;
    }
}