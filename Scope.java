import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


class Difference {
  	private int[] elements;
  	public int maximumDifference;


    Difference(int[] elements){
        this.elements = elements;
    }

    int computeDifference(){
        maximumDifference = 0;

        for(int element = 0; element < elements.length-1; element++)
        {
            for(int nextElement = 1; nextElement < elements.length; nextElement++)
            {
                int absoluteDifference = Math.abs(elements[element]
                - elements[nextElement]);

                if(absoluteDifference > maximumDifference)
                {
                    maximumDifference = absoluteDifference;
                }                
            }
        }

        return maximumDifference;
    }


} // End of Difference class

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}