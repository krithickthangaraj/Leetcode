class Solution {
    public int leastBricks(List<List<Integer>> wall) {
       
        HashMap<Integer,Integer> in=new HashMap<>();
        for(int i=0;i<wall.size();i++){
            int num=0;
            for(int j=0;j<wall.get(i).size()-1;j++){
                num+=wall.get(i).get(j);
                in.put(num,in.getOrDefault(num,0)+1);
            }
        }
        int res=0;
        if (!in.isEmpty()) {

            res=Collections.max(in.values());
        }
        return wall.size()-res;
    }
}