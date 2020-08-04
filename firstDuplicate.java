int firstDuplicate(int[] a) {
    // Find first duplicate number
    // for which the second occurrence has the minimal index.
    // If just one duplicate number, return duplicate.
    int minIndex = 0;
    Map<Integer, Integer> numbers = new HashMap<Integer, Integer>();
    boolean duplicate = false;
    
    // a = [2, 1, 3, 5, 3, 2]
    // result: firstDuplicate = 3
    // Two dupes: 2 and 3
    for(int element = 0; element < a.length; element++){
        if(!numbers.containsKey(element)){
            numbers.put(element, 1);
        }
        else {
            numbers.put(element, numbers.get(element)+1);
        }
    }
    
    Iterator numberIterator = numbers.entrySet().iterator();
    
    List<Integer> duplicates = new ArrayList();
        
    while(numberIterator.hasNext()){
        Map.Entry element = (Map.Entry)numberIterator.next();
        
        if(element.getValue()>2){
            
        }
    }
    
    if(duplicates.size() > 1){
        
    }
    
    
    return -1;
}