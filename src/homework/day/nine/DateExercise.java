package homework.day.nine;
import java.util.*;

public class DateExercise {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        System.out.println("Current Date and Time:" + cal.getTime());
        System.out.println("Actual Max Year:" + cal.getActualMaximum(Calendar.YEAR));
        System.out.println("Actual Max Month:" + cal.getActualMaximum(Calendar.MONTH));
        System.out.println("Actual Week of year:" + cal.getActualMaximum(Calendar.WEEK_OF_YEAR));
        System.out.println("Actual Max Date:" + cal.getActualMaximum(Calendar.DATE));

    }
}
