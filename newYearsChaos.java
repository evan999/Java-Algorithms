import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the minimumBribes function below.
    static void minimumBribes(int[] q) {

        int minBribes = 0;
        boolean chaotic = false;
        int bribes = 0;

        for(int position = 0; position < q.length; position++)
        {
            int currentValue = q[position];
            int currentPosition = position+1;
            
            if(currentPosition!=q[position]){
                int difference = 0;
                if(q[position]>currentPosition){
                    difference = q[position]-currentPosition;
                }

                if(difference > 2){
                    chaotic = true;
                    break;
                }
                bribes += difference;
            }
            else{
                continue;
            }

            minBribes = bribes;
        }

        if(chaotic==false){
            System.out.println(minBribes);
        }
        else{
            System.out.println("Too chaotic");
        }
    

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] q = new int[n];

            String[] qItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int qItem = Integer.parseInt(qItems[i]);
                q[i] = qItem;
            }

            minimumBribes(q);
        }

        scanner.close();
    }
}
