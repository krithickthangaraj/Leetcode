class Solution {
    public List<Integer> findWordsContaining(String[] words, char x) {
        ArrayList<Integer> in= new ArrayList<>();
        int j=0;
        for(String i : words)
        {
          if(i.contains(String.valueOf(x))){
            in.add(j);
            
          }
          j++;
        }
        return in;
    }
}