package homework.day.firsttoseven;

import java.util.Scanner;

public class lesson5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Hərfi daxil edin:");
		
		Scanner sc = new Scanner(System.in);
				
		String inputtext = sc.next();
		
		if(inputtext.length()>1||!Character.isLetter(inputtext.charAt(0)))
		{
			System.out.print("Error");
		}
		
		else {
		
		char c = inputtext.charAt(0);

        if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'||c == 'A' || c == 'R' || c == 'I' || c == 'O' || c == 'U' )
            System.out.println(c + " is vowel");
        else
            System.out.println(c + " is consonant");
		}

	}

}
