package homework.day.eight;

import java.util.Scanner;

public class CheckYear {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("İli daxil edin: ");
        int year = in.nextInt();

        System.out.println(checkLeapYear(year));
    }

    public static boolean checkLeapYear(int year)
    {
        if(year % 4!=0)
            return false;

        else
            if (year % 100 != 0)
                return true;

            else
                if (year % 400 != 0)
                return false;
                else return true;

    }
}
