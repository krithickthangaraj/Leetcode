class Solution {
    public int totalFruit(int[] arr) {
        int l=0,r=0;
        int max=0;
        HashMap<Integer,Integer> in=new HashMap<>();
        while(r<arr.length)
        {
            in.put(arr[r],in.getOrDefault(arr[r],0)+1);
            while(in.size()>=3)
            {
                in.put(arr[l],in.get(arr[l])-1);
                if(in.get(arr[l])==0) in.remove(arr[l]);
                l++;
            }
            r++;
            
            max=Math.max(max,r-l);
        }
        return max;
    }
}