class Solution {
    public boolean isPalindrome(String s) {
        String cleanStr = s.replaceAll("\\s+","").toLowerCase();
        StringBuilder unfilteredStr = new StringBuilder(cleanStr);
        StringBuilder reverseStr = unfilteredStr.reverse();
        
        return reverseStr.equals(unfilteredStr);
    }
}