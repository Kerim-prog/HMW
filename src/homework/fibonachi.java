package homework;

import java.util.Scanner;

public class fibonachi {
	public static void main(String[] args) {
	
		System.out.print("Rəqəm daxil edin:");
		
		Scanner sc = new Scanner(System.in);
				
		int n = sc.nextInt();
		
		int a= 0; 
		int b=1; 
		
		
	       for (int i = 1; i <= n; i++)
	        {
	            System.out.println(a);

	            int c = a + b;
	            a = b;
	            b = c;
	        }
		
		
		
		
		
	}

}
