import java.util.Scanner;
class Thursday
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.briyani");
		System.out.println("2.Meals");
		System.out.println("3.Fast Food");
		int option=sc.nextInt();
		if(option==1)
		{
			System.out.println("1.C briyani 150");
			System.out.println("2.M briyani 200");
			System.out.println("3.E briyani 300");
			int opt =sc.nextInt();
			if(opt==1)
			{
				System.out.println("enter your quantity");
				int quantity=sc.nextInt();
				System.out.println(quantity+"Chicken briyani"+quantity*150);
				
			}
			
			
			
		}
		
		
		
		
		
	}
	
	
	
	
}