public int firstUniqChar(String s) {
        // Return index of first non-repeating character in string
        // If no non-repeating character exists in string, return -1
        Map<Character, Integer> characters = new HashMap<Character, Integer>();
        
        
        // Convert string to a char array
        char[] strArray = s.toCharArray();
        
        // Loop through char array, adding the characters and their indices to 
        for(int ch = 0; ch < strArray.length; ch++){
            if(!characters.containsKey(strArray[ch])){
                characters.put(strArray[ch], 1);
            }
            else{
                characters.put(strArray[ch], characters.get(strArray[ch])+1);
            }
        }
        
        
        /*
        for (Map.Entry character : characters.entrySet()){
            int occurrences = (int) character.getValue();
            int index = (int) character.getKey();
            
            if(occurrences == 1){
                return index;
            }
        }
        */
        
        return -1;