package homework.day.eleven;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionsExercise {

    public static void main(String[] args) {
        int a=1;
        int b=1;

        Scanner sc = new Scanner(System.in);
        try{
            a= sc.nextInt();
            b= sc.nextInt();

            try{System.out.println(a/b);
            }
            catch(ArithmeticException e)
            {
                System.out.println("Devide by Zero");
            }
            catch (Exception e)
            {
                System.out.println("Exception:"+e);
            }

        }
        catch(InputMismatchException e)
        {
            System.out.println("Your input is not a valid type");
        }



    }
}
