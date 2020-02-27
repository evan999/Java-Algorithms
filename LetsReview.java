import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
			
        Scanner in = new Scanner(System.in);

        int T = in.nextInt();
        
        in.nextLine();

        for(int test = 0; test < T; test++)
        {
            String input = in.nextLine();
            char[] strArray = input.toCharArray();

            for(int character = 0; character < input.length(); character+=2)
            {
                System.out.print(strArray[character]);               
            }

            System.out.print(" ");

            for(int character = 1; character < input.length(); character+=2)
            {
                System.out.print(strArray[character]);
            }

            System.out.println("");
        }
    }
}