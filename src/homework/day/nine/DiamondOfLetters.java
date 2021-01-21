package homework.day.nine;

public class DiamondOfLetters {
    public static void main(String[] args) {

        printDiamond(5);
    }

    public static void printDiamond(int n){

        int s = n;

        for (int i=1;i<=n;i++){
            for (int k=s;k>0;k--){System.out.print(" ");}
            for (int j=1;j<=i;j++){System.out.print((char)(64+j));}
            for (int j=i-1;j>0;j--){System.out.print((char)(64+j));}
            System.out.println("");
            s--;
        }

        for (int i=n;i>0;i--){
            for (int k=0;k<=s;k++){System.out.print(" ");}
            for (int j=1;j<=i;j++){System.out.print((char)(64+j));}
            for (int j=i-1;j>0;j--){System.out.print((char)(64+j));}
            System.out.println("");
            s++;
        }






    }

}
