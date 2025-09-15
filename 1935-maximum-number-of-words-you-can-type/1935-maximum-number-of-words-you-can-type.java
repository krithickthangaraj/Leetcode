class Solution {
    public int canBeTypedWords(String text, String broken) {
        String [] arr=text.split(" ");
        int c=0;
        for(String i:arr){
             boolean can=false;

           for(char j:broken.toCharArray()){
                if(i.contains(String.valueOf(j))) {
                    can=true;
                    break;
                }
                
           }
            if(!can) c++;

        }
        return c;
    }
}