package homework.day.nine;

import java.util.Scanner;

public class DiamondOfStars {
    public static void main(String[] args) {
        System.out.print("Ədəd daxil edin(half of the diamond): ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        printDiamond(count);
    }

    public static void printDiamond(int n){
        int s=n;
        for (int i=1;i<=n;i++)
        {
            for (int k=s;k>0;k--)
            {System.out.print(" ");}
            for (int j=1;j<=2*i-1;j++)
            {System.out.print("*");}
            System.out.println("");
            s--;
        }

        for (int i=n;i>0;i--)
        {
            for (int k=0;k<=s;k++)
            {System.out.print(" ");}
            for (int j=1;j<=2*i-1;j++)
            {System.out.print("*");}
            System.out.println("");
            s++;
        }



    }
}
