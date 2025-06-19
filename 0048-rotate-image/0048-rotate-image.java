class Solution {
    public void rotate(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                int temp=mat[i][j];
                mat[i][j]=mat[j][i];
                mat[j][i]=temp;
            }
        }
        for(int i=0;i<n;i++){
            
                int l=0;
                int r=m-1;
                while(l<r){
                    int temp=mat[i][l];
                    mat[i][l]=mat[i][r];
                    mat[i][r]=temp;
                    l++;
                    r--;
                }
            }
        
    }
}