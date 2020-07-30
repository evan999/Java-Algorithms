import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
        // Return a long -> number of occurrences of a in new string
        // 
        long numOccurrences = 0;
        //StringBuilder repeatStr = new StringBuilder("");

        // Count as in string
        // For each concat of string, increment numOccurrences by number of as in
        // initial string until n is reached.

        if(s.length()==1 && s.charAt(0)=='a'){
            numOccurrences = s.length() * n;
            return numOccurrences;
        }

        for(int i = 0; i < s.length(); i++){
            if('a' == s.charAt(i)){
                numOccurrences++;
            }
        }

        long totalOccurrences = numOccurrences;

        for(int i = s.length(); i <= n; i+= s.length()){
            totalOccurrences+=numOccurrences;
            System.out.println(i);
        }

        /*
        for(int i = s.length(); i <= n; i+=s.length()){
            //System.out.println(s.charAt(i));
            //System.out.println(i);
            System.out.println(repeatStr.append(s));
        }
        */

        return totalOccurrences;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}