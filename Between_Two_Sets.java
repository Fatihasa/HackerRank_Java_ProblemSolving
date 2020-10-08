/*
https://www.hackerrank.com/challenges/between-two-sets/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
        
        int countOne = 0, countTwo = 0 , value = a.get(a.size()-1), k = 0, finalCount = 0;
        
        /*this for loop returns the last element of the list 'a' to the first element of the list 'b'. 
        This help us to reaching all numbers between two sets.*/
        for(int i = 0 ; i!=(b.get(0)+1) ; i++){
            
            for(int j = 0; j!=a.size() ; j++){

                if((value+k)%a.get(j) == 0){
                        countOne++;
                        System.out.println("countOne "+countOne);
                        
                    }
            }

            for(int j = 0; j!=b.size() ; j++){

                if(b.get(j)%(value+k) == 0){
                        countTwo++;
                        System.out.println("countTwo "+countTwo);
                        
                    }
            }

            if((countOne == a.size()) && (countTwo == b.size())){

                finalCount++;
                
            }
            k++;
            countOne=0;
            countTwo=0;

        }


            return finalCount;



    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> brr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int total = Result.getTotalX(arr, brr);

        bufferedWriter.write(String.valueOf(total));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
