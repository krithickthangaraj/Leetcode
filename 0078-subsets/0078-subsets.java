class Solution {
    public void func(List<List<Integer>> ans,List<Integer> in,int[] nums, int start){
        ans.add(new ArrayList<>(in));
        for(int i=start;i<nums.length;i++){
            in.add(nums[i]);
            func(ans,in,nums,i+1);
            in.remove(in.size()-1);
        }
       
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        func(ans,in,nums,0);
        return ans;
    }
}