/**
Problem Link: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem?h_r=next-challenge&h_v=zen&isFullScreen=false
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the designerPdfViewer function below.
    static int designerPdfViewer(int[] h, String word) {
            
            HashMap<Character, Integer> map = new HashMap<Character, Integer>();
            
            char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                              Di'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
            
            /**
            This for loop adding each letters to the map as a key value. The program gives us a 
            int array which is the values of letters. Each letter always has the same value so 
            that we can assign values to the letters in alphabetic order.
            */
            for(int i = 0 ; i<letters.length ; i++){
              
                map.put(letters[i],h[i]);
            }
            
            /**
            This for loop checks each character of the string which is given by program. And it 
            finds the maximum value of letter as a height of our rectangle. 
            */
            int maxHeight = 0;
            for(int i = 0 ; i<word.length() ; i++){
             
                int height = map.get(word.charAt(i));
                
                if(height>maxHeight){
                    maxHeight = height;
                }
                   
            }
            //Our code returns the area of the rectangle.
            return maxHeight*word.length();

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[] h = new int[26];

        String[] hItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 26; i++) {
            int hItem = Integer.parseInt(hItems[i]);
            h[i] = hItem;
        }

        String word = scanner.nextLine();

        int result = designerPdfViewer(h, word);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
