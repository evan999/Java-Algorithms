//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, String> phonebook = new HashMap<String, String>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            String phone = in.next();
            // Write code here
            phonebook.put(name, phone);
        }
        while(in.hasNext()){
            String name = in.next();
            // Write code here
            
            if(phonebook.containsKey(name))
            {
                System.out.println(name + "=" + phonebook.get(name));
            }
            else
            {
                System.out.println("Not found");
            }  
        }
        in.close();
    }
}