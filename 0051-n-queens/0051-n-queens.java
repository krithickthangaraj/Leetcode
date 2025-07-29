class Solution {

    public boolean safe(char[][] arr,int row,int col, int n){
        int drow=row;
        int dcol=col;

        while(row>=0 && col>=0){
            if(arr[row][col]=='Q'){
                return false;
            }
            row--;
            col--;
        }
        row=drow;
        col=dcol;

        while(col>=0){
            if(arr[row][col]=='Q') return false;
            col--;
        }
        row=drow;
        col=dcol;

        while(row<n && col>=0){
            if(arr[row][col]=='Q') return false;
            col--;
            row++;
        }

        return true;



    }

    public void solve(int col,int n,List<List<String>> in,char[][] arr ){

           if(col==n){
            ArrayList<String> ch=new ArrayList<>();

            for(char[] i : arr){     
                ch.add(new String(i));
    
            }
            in.add(ch); 
            return ;
           }

           for(int row=0; row<n; row++){
            if(safe(arr,row,col,n)){
                arr[row][col]='Q';
                solve(col+1,n,in,arr);
                arr[row][col]='.';
            }
           }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> in=new ArrayList<>();
        char[][] arr=new char[n][n];

        for(int i=0;i<n;i++){
            Arrays.fill(arr[i],'.');
        }

        solve(0,n,in,arr);
        return in;
    }
}