package homework;

import java.util.Scanner;

public class checknumbers {
    public static void main(String[] args) {
        System.out.print("1ci ədədi daxil edin:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.print("2ci ədədi daxil edin:");
        sc = new Scanner(System.in);
        int b = sc.nextInt();
        System.out.print("3cu ədədi daxil edin:");
        sc = new Scanner(System.in);
        int c = sc.nextInt();
        System.out.println(smallest(a,b,c));
    }

    public static int smallest(int a,int b, int c)
    {
        int smallest=0;
        if(a<b&&a<c)
        {smallest= a;}
        if(b<a&&b<c)
        {smallest=  b;}
        if(c<b&&c<a)
        {smallest=  c;}
        return smallest;
    }



}
