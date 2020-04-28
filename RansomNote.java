import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static void checkMagazine(String[] magazine, String[] note) {

        Map<String, Integer> magazineWords = new HashMap<String, Integer>();

        Map<String, Integer> noteWords = new HashMap<String, Integer>();
        boolean possible = true;

        for (String word : magazine) {
            if(!magazineWords.containsKey(word)){
                magazineWords.put(word, 1);
            } else {
                magazineWords.put(word, magazineWords.get(word)+1);
            }
        }

        for (String word : note) {
            if(!noteWords.containsKey(word)){
                noteWords.put(word, 1);
            } else {
                noteWords.put(word, noteWords.get(word)+1);
            }
        }


        for(String wordNeeded : noteWords.keySet()){
            if(!magazineWords.containsKey(wordNeeded)){
                possible = false;
                break;
            }
            else if(noteWords.get(wordNeeded) > magazineWords.get(wordNeeded)){
                possible = false;
                break;
            }
        }
        
        System.out.println(possible ? "Yes" : "No");
        
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        String[] magazine = new String[m];

        String[] magazineItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            String magazineItem = magazineItems[i];
            magazine[i] = magazineItem;
        }

        String[] note = new String[n];

        String[] noteItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            String noteItem = noteItems[i];
            note[i] = noteItem;
        }

        checkMagazine(magazine, note);

        scanner.close();
    }
}