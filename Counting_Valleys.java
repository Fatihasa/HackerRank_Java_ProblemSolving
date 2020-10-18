/*
Problem Link: https://www.hackerrank.com/challenges/counting-valleys/problem?h_r=next-challenge&h_v=zen&isFullScreen=true
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
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
    
    int altitude=0; 
    int numberOfValley=0;
     
    //In this soliton I counted a specific point which is altitude equals zero an one step before string characher must be 'U'.
    //This point shows us the ending point of valley.
    for(int i=0; i<path.length() ; i++){

        if(path.charAt(i)=='U'){
            altitude+=1;
            if(altitude == 0){

            numberOfValley+=1;
            }
        
        }else{
            altitude-=1;
        }
            
    }
    return numberOfValley;
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int steps = Integer.parseInt(bufferedReader.readLine().trim());

        String path = bufferedReader.readLine();

        int result = Result.countingValleys(steps, path);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
