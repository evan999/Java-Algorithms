class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> uniqueNums = new HashMap<>();
        
        if(nums.length < 2){
            return false;
        }
        
        for(int i = 0; i < nums.length; i++){
            if(!uniqueNums.containsKey(nums[i])){
                uniqueNums.put(nums[i], 1);
            }
            else{
                return true;
            }
        }
        
        return false;
    }
}