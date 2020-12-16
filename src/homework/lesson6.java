package homework;

import java.util.Scanner;

public class lesson6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Rəqəm daxil edin:");
		
		Scanner sc = new Scanner(System.in);
				
		int a = sc.nextInt();
		
		if(a==9||a==10)
		{
			System.out.println("Sobresaliente");
		}
		if(a==7||a==8)
		{
			System.out.println("Notable");
		}
		if(a==6)
		{
			System.out.println("Bien");
		}
		if(a==5)
		{
			System.out.println("Aprobado");
		}
		if(a>=0 && a<=4)
		{
			System.out.println("Suspenso");
		}


	}

}
