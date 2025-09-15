/*
    You are given a date. You just need to write the method, getDay, which returns the day on that date.
    To simplify your task, we have provided a portion of the code in the editor.

    Function Description: Complete the findDay function in the editor below.

    findDay has the following parameters:
        int: month
        int: day
        int: year

    Returns:
        string: the day of the week in capital letters
    Input Format:
        A single line of input containing the space separated month, day and year, respectively, in
        MM DD YYYY format.

    Constraints
        2000 < year < 3000
 */

package dateAndTime;

import java.io.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Challenge1 {
    /*
     * Complete the 'findDay' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER month
     *  2. INTEGER day
     *  3. INTEGER year
     */

    public static String findDay(int month, int day, int year) {

        LocalDate date = LocalDate.of(year,month, day);
        DayOfWeek dayName = date.getDayOfWeek();

        return dayName.toString();
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Challenge1.findDay(month, day, year);

        //bufferedWriter.write(res);
        //bufferedWriter.newLine();
        System.out.println(res); // ✅ Works locally

        bufferedReader.close();
        //bufferedWriter.close();
    }
}

