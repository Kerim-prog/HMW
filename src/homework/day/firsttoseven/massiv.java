package homework.day.firsttoseven;

import java.util.Scanner;

public class massiv {
    public static void main(String[] args) {
        int arr[] = {2, 7, 9,4,0};

        System.out.println("Ədədi daxil edin");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();

        for(int a:arr)
        {
            if(temp==a)
            {
                System.out.println("Daxil etdiyiniz eded var");
            }

        }


    }
}
