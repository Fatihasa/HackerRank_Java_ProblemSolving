/*
Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the 6 decimal value of each fraction on a new line with  places after the decimal.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the plusMinus function below.
    static void plusMinus(int[] arr) {
        
        float result[];
        result = new float[3];
        //in this for loop we are calculating that how many positive, negative and zero numbers. 0 index for positive, 1 index of negative, 2 index for zero numbers.
        for(int i : arr){
            if(i>0){
                result[0] ++;
            }else if(i<0){
                result[1] ++;
            }else{
                result[2] ++;
            }
        }
        
        //in this for loop we are dividing the number of +, - and zero numbers to length of the given array that give us to result of division as a float number.
        for(float i : result){
            System.out.println(i/arr.length);
        }

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
