package homework.day.firsttoseven;

import java.util.Scanner;

public class faktorial {
    public static void main(String[] args) {
        System.out.print("Eded daxil edin: ");
        Scanner sc = new Scanner(System.in);
        int a= sc.nextInt();
        System.out.println("Faktorial = "+findFaktorial(a));
    }

    public static int findFaktorial(int a)
    {
         return ((a != 1) ? a*findFaktorial(a-1) : 1);
    }
}
