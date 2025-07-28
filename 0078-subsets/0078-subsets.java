class Solution {
    public void func(int i,int n,int[] arr, List<List<Integer>> ans,List<Integer> in){
        if(i==n){
            ans.add(new ArrayList<>(in));
            return;
        }
        func(i+1,n,arr,ans,in);
        in.add(arr[i]);
        func(i+1,n,arr,ans,in);
        in.remove(in.size()-1);



    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        func(0,nums.length,nums,ans,new ArrayList<>());
        return ans;
    }
}