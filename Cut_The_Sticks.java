/*
Problem link: https://www.hackerrank.com/challenges/cut-the-sticks/problem
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        
        Integer[] what = Arrays.stream( arr ).boxed().toArray( Integer[]::new );
        List<Integer> list = Arrays.asList(what);
        ArrayList<Integer> ar = new ArrayList<>();

        int length = list.size();

        ar.add(list.size());
        while(length > 0){
            int min = Collections.max(list);
            for (int i: list) {
                if(min>i && i>0)min=i;
            }
            for(int i = 0; i < list.size() ; i++){
                if(list.get(i)- Collections.min(list)>=0){
                    list.set(i,list.get(i)-min);
                }
                if(list.get(i)==0){
                    if(length!=0)
                    length--;
                }

            }
            if(length!=0)
            ar.add(length);
        }
        int returnArr[] = new int[ar.size()];

        for(int i = 0; i<ar.size(); i++){
            returnArr[i] = ar.get(i);
        }
        return returnArr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = cutTheSticks(arr);

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
