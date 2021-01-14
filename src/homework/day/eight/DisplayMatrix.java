package homework.day.eight;

import java.util.Scanner;

public class DisplayMatrix {
    public static void main(String[] args)
    {

        Scanner in = new Scanner(System.in);
        System.out.print("Massiv ölçüsünü daxil edin: ");
        int n = in.nextInt();
        printNbyNMatrix(n);
    }

    public static void printNbyNMatrix(int n) {

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                System.out.print( "a"+" " );
            }
            System.out.println();
        }
    }
}
