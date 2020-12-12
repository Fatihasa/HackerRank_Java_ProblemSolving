/*
Problem link: https://www.hackerrank.com/challenges/append-and-delete/copy-from/190771969
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the appendAndDelete function below.
    static String appendAndDelete(String s, String t, int k) {
        
        int count = 0;

        int length = Math.min(s.length() , t.length());

        for(int i = 0 ; i<length ; i++){

            if(s.charAt(i) != t.charAt(i)){
                count = i;
                break;
            }else if(s.length()>length){
                if(s.charAt(i+1) == t.charAt(i)){
                    return "Yes";
                }
            }else if(t.length()>length){
                if(s.charAt(i) == t.charAt(i+1)){
                    return "Yes";
                }
            }

        }
        int sum = s.length()+t.length()-(2*count);
        
        
        if(s.equals(t))return "Yes";
        if(sum>k)return "No";
        else return "Yes";

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String t = scanner.nextLine();

        int k = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String result = appendAndDelete(s, t, k);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
