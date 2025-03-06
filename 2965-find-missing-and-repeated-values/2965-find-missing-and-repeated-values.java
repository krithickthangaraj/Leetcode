class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int len=grid[0].length*grid.length;
        int arr[]=new int[len];
        int k=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
             arr[k]=grid[i][j];
             k++;
            }
        }
        Arrays.sort(arr);
        int rep=-1;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]==arr[i+1])
            {
                rep=arr[i];
                break;
                
            } 
        }
        int exp=(len*(len+1))/2;
        int act=Arrays.stream(arr).sum();
        int res=exp-(act-rep);
        return new int[]{rep,res};

    }
}