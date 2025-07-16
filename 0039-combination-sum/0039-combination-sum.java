class Solution {
    public void find(int i,int arr[], int t, List<List<Integer>> ans, List<Integer> ds){
        if(i==arr.length){
            if(t==0) ans.add(new ArrayList<>(ds));
            return;
        }
        if(arr[i]<=t){
            ds.add(arr[i]);
            find(i, arr , t-arr[i] , ans, ds);
            ds.remove(ds.size()-1);
        }
        find(i+1, arr , t , ans, ds);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        find(0, candidates , target , ans, new ArrayList<>());
        return ans;
    }
}