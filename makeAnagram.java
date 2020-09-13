import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static int makeAnagram(String a, String b) {

        HashMap<Character, Integer> frequency = new HashMap<Character, Integer>();
        char[] strA = a.toCharArray();
        char[] strB = b.toCharArray();

        for(char c : strA){
            if (frequency.containsKey(c)){
                frequency.put(c, frequency.get(c) + 1);
            }
            else {
                frequency.put(c, 1);
            }
        }

        for(char c : strB){
            if (frequency.containsKey(c)){
                frequency.put(c, frequency.get(c) - 1);
            }
            else{
                frequency.put(c, 1);
            }
        }

        int deletions = 0;
        for(int value : frequency.values()){
            deletions += Math.abs(value);
        }

        return deletions;
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
