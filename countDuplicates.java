class Result {

    public static int countDuplicate(List<Integer> numbers) {
        
        Collections.sort(numbers);

        HashMap<Integer, Integer> listNumbers = new HashMap<Integer, Integer>(); 

        int dupes = 0;
        
        
        for(int i = 0; i < numbers.size(); i++){
            if(!listNumbers.containsKey(numbers.get(i))){
                listNumbers.put(numbers.get(i), 1);
            } 
            else {
                listNumbers.put(numbers.get(i), numbers.get(i)+1); 
            }
        }

        for(Map.Entry number : listNumbers.entrySet()){
            int occurrences = (int)number.getValue();
            
            if(occurrences > 1){
                dupes++;
            }
            else {
                continue;
            }
        }
        return dupes;

}