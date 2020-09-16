class Solution {
    public boolean isValid(String s) {
        // An open bracket must be closed by an equivalent closing bracket
        // [] () {}
        // Otherwise, string is invalid
        // Loop through the string
        // If next character immediately following it is not a closing bracket
        // Return false
        // Else keep going until end of string or mismatching bracket is encountered
        //boolean valid = false;
        
        if(s.length() <= 1 || s.length() % 2 != 0){
            return false;
        }
        
        //char[] chars = s.toCharArray();
        
        int count = 0;
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i)=='(' || s.charAt(i)=='{' || s.charAt(i) == '['){
                count++;
            }
            else if (s.charAt(i)==')' || s.charAt(i)== '}' || s.charAt(i) == ']'){
                count--;
            }
            
            if(count < 0){
                return false;
            }
        }
        
        if(count != 0){
            return false;
        }
        
        
        return true;
    }
}