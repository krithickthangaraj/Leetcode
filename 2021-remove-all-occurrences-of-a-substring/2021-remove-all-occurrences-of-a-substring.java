class Solution {
    public String removeOccurrences(String s, String part) {
        // Loop until all occurrences of `part` are removed
        while (s.contains(part)) {  
            // Find the first occurrence of `part` in `s`
            int idx = s.indexOf(part);
            
            // Erase `part` from `s` at position `idx`
            s = s.substring(0, idx) + s.substring(idx + part.length());
        }
        
        // Return the modified string
        return s;
    }
}