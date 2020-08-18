class Solution {
    public boolean isAnagram(String s, String t) {
        
        HashMap<Character, Integer> sChars = new HashMap<Character, Integer>();
        HashMap<Character, Integer> tChars = new HashMap<Character, Integer>();
        
        boolean anagrams = false;
        
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        
        for(char c : sArray){
            if(sChars.containsKey(c)){
                sChars.put(c, sChars.get(c)+1);
            }
            else{
                sChars.put(c, 1);
            }
        }
        
        for(char c : tArray){
            if(tChars.containsKey(c)){
                tChars.put(c, tChars.get(c)+1);
            }
            else{
                tChars.put(c, 1);
            }
        }
    
        return sChars.equals(tChars);
        
        
    }
}