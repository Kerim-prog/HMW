package homework;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        System.out.print("Sətir daxil edin:  ");
        Scanner sc = new Scanner(System.in);
        String inputText = sc.nextLine();
        System.out.println("Reversed Text: "+reverse(inputText));

    }

    private static String reverse (String txt)
    {
       String reversedText="";
       for(int i=txt.length()-1;  i>=0;  i--)
       {
           reversedText+= txt.charAt(i);
       }
       return reversedText;
    }


}
