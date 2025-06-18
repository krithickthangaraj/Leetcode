class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> in=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++)
        {
            if(i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int j=i+1;
            int k=nums.length-1;
            
            while(j<k)
            {
                int num=nums[i]+nums[j]+nums[k];
                if(num>0) k--;
                else if(num<0) j++;
                else  
                {
                    in.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                
                while(j<k && nums[j]==nums[j-1]){
                    j++;
                }
                }

            }
        }
        return in;
        
    }
}