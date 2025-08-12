class Solution {
    public void fun(List<List<Integer>> ans,List<Integer> in,boolean[] freq,int[] nums){
        if(in.size()==nums.length){
            ans.add(new ArrayList<>(in));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                in.add(nums[i]);
                fun(ans,in,freq,nums);
                in.remove(in.size()-1);
                freq[i]=false;
            }
        }
    }
    public String getPermutation(int n, int k) {
        int[] nums=new int[n];
        for(int i=0;i<n;i++) nums[i]=i+1;
        List<List<Integer>> ans =new ArrayList<>();
        List<Integer> in=new ArrayList<>();
        boolean freq[]= new boolean[nums.length];
        fun(ans,in,freq,nums);
        ans.sort((a, b) -> {
            String sa = a.toString();
            String sb = b.toString();
            return sa.compareTo(sb);
        });

        StringBuilder sb = new StringBuilder();
            for (int num : ans.get(k - 1)) {
                sb.append(num);
            }
        return sb.toString();

        
    }
}


