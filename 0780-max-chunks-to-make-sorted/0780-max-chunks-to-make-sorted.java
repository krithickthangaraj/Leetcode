class Solution {
    public int maxChunksToSorted(int[] arr) {
        int run=0;
        int curr=0;
        int res=0;
        for(int i=0;i<arr.length;i++){
            run+=arr[i];
            curr+=i;
            if(run==curr) res++;
            
        }
        return res;
    }
}