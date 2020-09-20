class Solution {
	public int[] twoSum(int[] nums, int target) {
			HashMap<Integer, Integer> map = new HashMap<>();
			int[] arr = new int[2];
			
			for(int num = 0; num < nums.length; num++){
					if(map.containsKey(target-nums[num])){
							arr[0] = num;
							arr[1] = target-nums[num];
					}
					else{
							map.put(num, 1);
					}
			}
			
			return arr;
	}
}