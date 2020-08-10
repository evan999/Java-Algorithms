class Solution {
	public int firstUniqChar(String s) {

			boolean visited[] = new boolean[s.length()];
			
			Arrays.fill(visited, false);
			
			char[] strArray = s.toCharArray();
			
			for(int i = 0; i < strArray.length; i++){
					if(visited[i]==true){
							continue;
					}
					
					int count = 1;
					for (int j = i+1; j < strArray.length; j++){
							if(strArray[i] == strArray[j]){
									visited[j] = true;
									count++;
							}
					}
					
					if(count == 1){
							return i;
					}
			}
			
			
			return -1;
	}
}