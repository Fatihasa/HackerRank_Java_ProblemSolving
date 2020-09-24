/*

Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.

Note: - 12:00:00AM on a 12-hour clock is 00:00:00 on a 24-hour clock.
- 12:00:00PM on a 12-hour clock is 12:00:00 on a 24-hour clock.

Sample Input 0

07:05:45PM

Sample Output 0

19:05:45

*/

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;  

public class Solution {

    /*
     * Complete the timeConversion function below.
     */
    static String timeConversion(String s) {
        try {
            //Date/time pattern of input date (12 Hours format - hh used for 12 hours)
            DateFormat df = new SimpleDateFormat("hh:mm:ssaa");

            //Date/time pattern of desired output date (24 Hours format HH - Used for 24 hours)
            DateFormat outputformat = new SimpleDateFormat("HH:mm:ss");
            Date date = null;
            String output = null;

            //Returns Date object
            date = df.parse(s);

            //old date format to new date format
            output = outputformat.format(date);
            System.out.println(output);

            return output;
        } catch (Exception e) {
            System.out.println(e);
        }
        return s;
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
