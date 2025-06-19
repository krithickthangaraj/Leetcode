class Solution {
    public int numberOfBeams(String[] bank) {
        int m=bank[0].length();
        int n = bank.length;
        int arr[]=new int[n];
        
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<m;j++)
            {
                if(bank[i].charAt(j)=='1') c++;

            }
            arr[i]=c;
        }
        
        int sum=0;
        int prev=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                sum+=prev*arr[i];
                prev=arr[i];
            }
        }
        return sum;

            
            

        }

        
    }
