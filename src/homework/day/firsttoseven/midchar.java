package homework.day.firsttoseven;

import java.util.Scanner;

public class midchar {
    public static void main(String[] args) {
        System.out.print("Ədəd daxil edin:");
        Scanner sc = new Scanner(System.in);
        String num = sc.nextLine();
        System.out.println(MiddleCharacter(num));
    }

    public static String MiddleCharacter(String num)
    {

        if(num.length()%2!=0)
        {
            int a = num.length()/2;
            return num.substring(a,a+1);
        }

        else {
            int a = num.length()/2;
            return num.substring(a-1,a+1);
        }



    }

}
