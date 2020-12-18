package homework;

import java.util.Scanner;

public class lesson8 {
	public static void main(String[] args) {

		String a="n";

        String b="";
        
		int i=0;
		
		while(a.equals("n"))
		{
		System.out.print("Eded daxil edin:  ");	
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		b=b +" "+ temp;
		i++;
		System.out.print("dayandirmaq isteyirsiz:  ");	
		Scanner scan = new Scanner(System.in);
		a=scan.nextLine();
		
		}	
		
			System.out.println(b);
		
		

		

		
		
	
	}

}
