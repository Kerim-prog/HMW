package homework;

import java.util.Scanner;

public class agechecker {
    public static void main(String[] args) {
        System.out.print("Yaş daxil edin:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        checkhage(a);


    }


    public static void checkhage(int age)
    {
        if(age>18)
        {System.out.println("olar");}
        else
            System.out.println("olmaz");
    }




}
