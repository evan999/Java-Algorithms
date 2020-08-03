class Result {

    /*
     * Complete the 'minimalOperations' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static List<Integer> minimalOperations(List<String> words) {
    // Write your code here
        // words = ['add', 'boook', 'break']
        // change last d in add, change middle o in book, nothing to change in break
        
        // minimalOperations
        // Return list of Integers, minimum operations to fix words[i]
        // Keep track of fixes to each word in output list
        // Need to manipulate each string in list of strings
        // Replace letter d 
        // 

        //HashMap<String, Integer> wordFixes = new HashMap<String, Integer>();
        // Keep track of sequences of repeating characters.

        List<Integer> wordFixes = new ArrayList<Integer>();
        

        for(int word = 0; word < words.size(); word++){
            int fixes = 0;
            String text = words.get(word);
            //System.out.println(text);
            
            for(int ch = 1; ch < text.length(); ch++){
                //System.out.println(text.charAt(ch));
                if(text.charAt(ch)==text.charAt(ch-1)){
                    //System.out.println("Fix!");
                    fixes++;
                }
                else {
                    continue;
                }
            }   

            wordFixes.add(fixes);
            
        }

        return wordFixes;

    }

}
