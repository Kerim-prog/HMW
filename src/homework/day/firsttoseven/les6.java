package homework.day.firsttoseven;

import java.util.Scanner;

public class les6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.print("Rəqəm daxil edin:");
		
		Scanner sc = new Scanner(System.in);
				
		String output = "";
		int a = sc.nextInt();
		
		
		switch (a) {

	      case 9|10:
	        output = "Sobresaliente";
	        break;

	      case 7|8:
	    	  output = "Notable";
	        break;

	      // match the value of week
	      case 6:
	    	  output = "Bien";
	        break;

	      case 5:
	    	  output = "Aprobado";
	        break;
	        
	      case 0|1|2|3|4:
	    	  output = "Suspens";
	        break;
	      
	      default:
	    	  output = "Unknown";
	        break;

	    }
		
		System.out.print(output);
		



	}

}
