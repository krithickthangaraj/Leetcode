class Solution {
    public int findNumbers(int[] n) {
        int even=0;
        for(int i=0;i<n.length;i++){
            int c=(int)Math.log10(n[i])+1;
            if(c%2==0){
                even++;
            }
        }
        return even;
        
    }
}