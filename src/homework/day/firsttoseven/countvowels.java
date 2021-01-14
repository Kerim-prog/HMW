package homework.day.firsttoseven;

import java.util.Scanner;

public class countvowels {
    public static void main(String[] args) {
        System.out.print("Setir daxil edin: ");
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        System.out.println(countOfVowels(text));
    }

    public static int countOfVowels(String t)
    {
        int count = 0;
        for(int i=0;i<t.length();i++)
        {
            char c = t.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'R' || c == 'I' || c == 'O' || c == 'U' )
            {
               count++;
            }
        }
        return count;
    }


}
