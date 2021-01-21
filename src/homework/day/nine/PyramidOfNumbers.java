package homework.day.nine;

import java.util.Scanner;

public class PyramidOfNumbers {
    public static void main(String[] args) {
        System.out.print("Ədəd daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        printPyramid(count);
    }

    public static void printPyramid(int n){
        int s=n;
        for (int i=1;i<=n;i++)
        {
            for (int k=s;k>0;k--)
            {
                System.out.print(" ");
            }
            for (int j=1;j<=i;j++)
            {
                System.out.print(i+" ");
            }
            System.out.println("");
            s--;
        }

    }

}
