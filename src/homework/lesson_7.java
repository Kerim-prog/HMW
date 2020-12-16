package homework;

public class lesson_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c,d;

		for(int i=1000;i<10000;i++)
		{	a= i/1000;
			b=i/100%10;
			c=i/10%10;
			d=i%10;
			
		if(a+b==c+d)
		{
			System.out.println(i);
		}
		
		
		}
		

	}

}
