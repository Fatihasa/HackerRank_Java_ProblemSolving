/*
problem link: https://www.hackerrank.com/challenges/circular-array-rotation/problem?h_r=next-challenge&h_r%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=next-challenge&h_r%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=next-challenge&h_v=zen&h_v%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=zen&h_v%5B%5D%5B%5D%5B%5D%5B%5D%5B%5D=zen&isFullScreen=true
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        
        ArrayList<Integer> list = new ArrayList<Integer>(Collections.nCopies(a.length, 0));   
           
        int returnList[] = new int[queries.length];
        
        if(k > a.length){
            k %= a.length;
        }
          
        for(int i = 0,f = 0; i < a.length ; i++ ,k++){
            
            
            if(k >= a.length){
                list.set(f,a[i]);
                f++;
            }else{
                list.set(k,a[i]);
            }        
        }
        
        for(int i = 0; i < queries.length ; i++){
            
            returnList[i] = list.get(queries[i]);
        }
        
        return returnList;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nkq = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nkq[0]);

        int k = Integer.parseInt(nkq[1]);

        int q = Integer.parseInt(nkq[2]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] queries = new int[q];

        for (int i = 0; i < q; i++) {
            int queriesItem = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
            queries[i] = queriesItem;
        }

        int[] result = circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
