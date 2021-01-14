package homework.day.firsttoseven;

import java.util.Scanner;

public class ncem {
	
	public static void main(String[] args) {
		String a="y";
		int pos = 0;
		int neg = 0;
		int z = 0;
		
		
		while(a.equals("y"))
		{
		System.out.print("Eded daxil edin:  ");	
		Scanner sc = new Scanner(System.in);
		int temp = sc.nextInt();
		
		if(temp>0)
		{pos++;
		}
		if(temp<0)
		{neg++;
		}
		if(temp==0)
		{z++;}
		
		System.out.print("dayandirmaq isteyirsiz:  ");	
		Scanner scan = new Scanner(System.in);
		a=scan.nextLine();
		
		}
		
		
		System.out.println("Müsbət"+": "+pos);
		System.out.println("Mənfi"+": "+neg);
		System.out.println("Sıfır"+": "+z);
		

		

		
		
	}
	

}
