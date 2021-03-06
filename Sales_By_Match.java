/*
Problem Link: https://www.hackerrank.com/challenges/sock-merchant/problem?h_r%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=next-challenge&h_r%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=next-challenge&h_r%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=next-challenge&h_v%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=zen&h_v%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=zen&h_v%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=zen&isFullScreen=true&h_r=next-challenge&h_v=zen
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the sockMerchant function below.
    static int sockMerchant(int n, int[] ar) {

        HashSet<Integer> set = new HashSet<Integer>();
        int pair = 0;

        for(int i = 0; i < ar.length ; i++){
            int count = 0;
            if(set.contains(ar[i])){
                    continue;
                
            }else {
                for(int j = i; j<ar.length ; j++){
                    
                    if(ar[i]==ar[j]){
                        count++;  
                    }
                }
                set.add(ar[i]);
            }
            pair+=count/2;
        }

        return pair;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] ar = new int[n];

        String[] arItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arItem = Integer.parseInt(arItems[i]);
            ar[i] = arItem;
        }

        int result = sockMerchant(n, ar);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
