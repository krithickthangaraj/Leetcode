class Solution {
    public boolean isPal(String s,int start,int end){
        while(start<end){
            if(s.charAt(start++)!= s.charAt(end--)) return false;

        }
        return true;
    }
    public void solve(int index ,List<List<String>> res,List<String> in,String s){
        if(index==s.length()) {
            res.add(new ArrayList<>(in));
            return ;
        }

        for(int i=index;i<s.length();i++){
            if(isPal(s,index,i)){
                in.add(s.substring(index,i+1));
                solve(i+1,res,in,s);
                in.remove(in.size()-1);
            }
        }
        
    }
    public List<List<String>> partition(String s) {
        List<List<String>> res= new ArrayList<>();
        List<String> in=new ArrayList<>();
        solve(0,res,in,s); 
        return res;
        
    }
}