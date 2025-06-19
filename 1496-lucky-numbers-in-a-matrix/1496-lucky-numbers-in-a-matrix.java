class Solution {
    public List<Integer> luckyNumbers(int[][] mat) {
        int n=mat.length;
        int m=mat[0].length;
        List<Integer> in=new ArrayList<>();
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                int num=mat[i][j];
                boolean col=true;
                boolean row=true;
                for(int k=0;k<m;k++)
                {
                    if(mat[i][k]<num)
                    {
                        row=false;
                         break;
                    }
                }
                 for(int k=0;k<n;k++)
                {
                    if(mat[k][j]>num)
                    {
                        col=false;
                         break;
                    }
                }
            if(col && row) in.add(mat[i][j]);
            }
        }
        return in;
        
    }
}