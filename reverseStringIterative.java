class Solution {
    public void reverseString(char[] s) {
        int len = s.length;
        
        for(int i = 0; i < len / 2; i++){
            swap(s, i, len - i - 1);
        }
    }
    
    private void swap(char[] s, int i, int j){
        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;
    }
}