/*
problem link: https://www.hackerrank.com/challenges/extra-long-factorials/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        
        BigInteger factorial = BigInteger.ONE;
        
        for(int counter = n; counter>=2 ; counter--){
            factorial = factorial.multiply(BigInteger.valueOf(counter));

        }

        System.out.println(factorial);

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
