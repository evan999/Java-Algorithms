import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the makeAnagram function below.
    static int makeAnagram(String a, String b) {
        // Scan two strings to find what characters to delete 
        // to make anagrams.
        // Return int min num of deletions
        // Keep track of the frequency of characters
        int minDeletions = 0;

        // Use Hashmap
        
        HashMap<Character, Integer> frequenciesA = new HashMap<Character, Integer>();
        HashMap<Character, Integer> frequenciesB = new HashMap<Character, Integer>();

        char[] aCharacters = a.toCharArray();
        char[] bCharacters = b.toCharArray();



        for(char ch : aCharacters){
            if(!frequenciesA.containsKey(ch)){
                frequenciesA.put(ch, 1);
            }
            else {
                frequenciesA.put(ch, frequenciesA.get(ch)+1);
            }


            //frequenciesA.put(a.charAt(i), 1);
            //frequenciesB.put(b.charAt(i), 1);
            //System.out.println("a: " + a.charAt(i));
            //System.out.println("b: " + b.charAt(i));
        }

        for(char ch : bCharacters){
            if(!frequenciesB.containsKey(ch)){
                frequenciesB.put(ch, 1);
            }
            else {
                frequenciesB.put(ch, frequenciesB.get(ch)+1);
            }
        }

        

        // Looping through a hashmap
        

        // We don't actually need to manipulate the strings
        // But need to record deletions

        // Loop through the strings



        return minDeletions;
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String a = scanner.nextLine();

        String b = scanner.nextLine();

        int res = makeAnagram(a, b);

        bufferedWriter.write(String.valueOf(res));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
