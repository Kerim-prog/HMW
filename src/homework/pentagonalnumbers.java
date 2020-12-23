package homework;

import java.awt.desktop.PreferencesEvent;
import java.util.Scanner;

public class pentagonalnumbers {
    public static void main(String[] args) {
        System.out.print("Sayı daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        pentagonalNumbers(a);

    }
    public static int[] pentagonalNumbers(int count)
    {
        int arr[] = new int[count];
        for(int i=1;i<=count;i++)
        {
           arr[i-1]=(3*i*i-i)/2;
           System.out.println(arr[i-1]);
        }
        return arr;

    }
}
