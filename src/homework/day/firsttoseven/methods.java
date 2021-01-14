package homework.day.firsttoseven;

import java.util.Scanner;

public class methods {
    public static void main(String[] args) {
        System.out.print("Yaş daxil edin:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        checkhage(a);


    }


    public static int kvadrat(int a)
    {
        System.out.println("method" + a*a);

        return a*a;
    }

    public static void sub(int element)
    {
        System.out.println(element +element);
    }


    public static int sqr(int element)
    {
        int a = element*element;
        System.out.println("intern"+ +a);
        sub(sqr(element));
        return a;
    }

    public static void checkhage(int age)
    {
        if(age>18)
        {System.out.println("olar");}
        else
            System.out.println("olmaz");
    }




}
