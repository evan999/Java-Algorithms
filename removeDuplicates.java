class Solution {
    public int removeDuplicates(int[] nums) {

        HashSet<Integer> uniqueNums = new HashSet<>();
        
        for(int element = 0; element < nums.length; element++){
            uniqueNums.add(element);
        }
      
        Iterator<Integer> iterator = uniqueNums.iterator();
        int length = 0;
        while(iterator.hasNext()){
            length++;
        }
        
        
        return length;
        
    }
}