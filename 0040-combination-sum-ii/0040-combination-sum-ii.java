import java.util.*;

class Solution {
    public void find(int start, int[] arr, int target, List<List<Integer>> res, List<Integer> temp) {
        if (target == 0) {
            res.add(new ArrayList<>(temp));
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (i > start && arr[i] == arr[i - 1]) continue; 
            if (arr[i] > target) break; 

            temp.add(arr[i]);
            find(i + 1, arr, target - arr[i], res, temp);
            temp.remove(temp.size() - 1);
        }
    }

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates); 
        List<List<Integer>> res = new ArrayList<>();
        find(0, candidates, target, res, new ArrayList<>());
        return res;
    }
}
