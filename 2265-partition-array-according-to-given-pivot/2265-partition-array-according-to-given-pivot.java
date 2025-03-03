class Solution {
    public int[] pivotArray(int[] num, int p) {
        int arr[]=new int[num.length];
        int l=0,r=num.length-1;
        for(int i=0,j=num.length-1;i<num.length;i++,j--){
            if(num[i]<p)
            {
                arr[l]=num[i];
                l++;
            }
            if(num[j]>p){
                arr[r]=num[j];
                r--;
            }
            
        }
        while(l<=r){
            arr[l]=p;
            l++;
        }
        
        
        return arr;
    }
}