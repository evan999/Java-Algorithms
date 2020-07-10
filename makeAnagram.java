import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int makeAnagram(String a, String b) {


        int count1[] = new int[26];  
        int count2[] = new int[26]; 

        for (int character = 0; character < a.length(); character++)
        {
            count1[a.charAt(character) - 'a']++;
            
        }

        for (int character = 0; character < b.length(); character++)
        {
            count2[b.charAt(character) - 'a']++;
        } 

        

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
