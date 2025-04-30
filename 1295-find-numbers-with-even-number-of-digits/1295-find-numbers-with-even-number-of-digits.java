class Solution {
    public int findNumbers(int[] n) {
        int even=0;
        for(int i=0;i<n.length;i++){
            int sum=n[i];
            int c=0;
            while(sum!=0){
                c++;
                sum/=10;
            }
            if(c%2==0){
                even++;
            }
        }
        return even;
        
    }
}