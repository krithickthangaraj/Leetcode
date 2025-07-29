class Solution {
    public void swap(int i,int j,int nums[]){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }

    public void fun(List<List<Integer>> ans,int[] nums,int start){
        if(start==nums.length){
            List<Integer> in=new ArrayList<>();
            for(int i:nums){
                in.add(i);

            }
            ans.add(new ArrayList<>(in));
            return ;
        }
        for(int i=start;i<nums.length;i++){
            swap(start,i,nums);
            fun(ans,nums,start+1);
            swap(start,i,nums);
            }
        }
    
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans =new ArrayList<>();
        fun(ans,nums,0);
        return ans;

        
    }
}