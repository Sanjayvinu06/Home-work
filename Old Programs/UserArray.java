import java.util.Scanner;
class UserArray
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your lenght");
		int length=sc.nextInt();
		
		int arra[]=new int[length];
		
		for(int i=0;i<arra.length;i++)
		{
			arra[i]=sc.nextInt();
			
		}
		for(int i=0;i<arra.length;i++)
		{
			
			System.out.println(arra[i]);
			
			
		}
		
			
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
}