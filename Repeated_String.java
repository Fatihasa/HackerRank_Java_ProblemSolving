/*
Problem link: https://www.hackerrank.com/challenges/repeated-string/problem
*/

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
        
        long countOne = 0, countSecond = 0;
        
        
        //System.out.println(str);
        
        for(int i = 0; i<s.length() ; i++){
            
            if(s.charAt(i) == 'a'){
                countOne++;
            }
        }
        countOne = (countOne*(n/s.length()));
        
        if(n%s.length()!=0){
            
            for(int i = 0; i<n%s.length(); i++){
                if(s.charAt(i) == 'a'){
                countSecond++;
            }
            }
        }
        
        return countOne+countSecond;

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
