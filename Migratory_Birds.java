/*
Problem Link: https://www.hackerrank.com/challenges/migratory-birds/problem?h_r=next-challenge&h_v=zen&isFullScreen=true&h_r=next-challenge&h_v=zen
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
import java.util.Map.Entry;

public class Solution {

    
    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

    int maxEntry = 0 , value = 0;
    int[] count = new int[6];
    /*
    count array's size is 6 which allow us to manage each index as a integer value.
    When arr array's value maches with count index we are incrementing the index's value.
    This help us to find how many times that number is used.
    */    
    for(int i = 0; i<arr.size() ; i++){
        
        count[arr.get(i)] += 1;

    }
    //in here we are just getting the maximum number of array which shows the higher rate of repitation of number.
    for(int  i = 0; i<count.length; i++) {
            
            if(count[i]>maxEntry){
                maxEntry = count[i];
                value=i;
            } 
    }

    return value;        

    }

    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
