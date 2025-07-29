class Solution {

    


    public void solve(int col,int n,List<List<String>> in,char[][] arr ,int[] rows, int[] lower, int[] upper){
           if(col==n){
            ArrayList<String> ch=new ArrayList<>();

            for(char[] i : arr){     
                ch.add(new String(i));    
            }
            in.add(ch); 
            return ;
           }


           for(int row=0; row<n; row++){
            if(rows[row]==0 && lower[row+col]==0 && upper[(n-1)+ (col-row)]==0){
            
            arr[row][col]='Q';
            rows[row]=1;
            lower[row+col]=1;
            upper[(n-1) + (col-row)]=1;

            solve(col+1,n,in,arr,rows,lower,upper);

            arr[row][col]='.';
            rows[row]=0;
            lower[row+col]=0;
            upper[(n-1)+ (col-row)]=0;


            }
           }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> in=new ArrayList<>();
        char[][] arr=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(arr[i],'.');
        }
        int rows[]=new int[n];
        int upper[]=new int[2* n-1];
        int lower[]=new int[2* n-1];


        solve(0,n,in,arr,rows,upper,lower);
        return in;
    }
}