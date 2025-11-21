import java.util.Scanner;
class practice
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your length");
		int length=sc.nextInt();
		int ar[]=new int[length];
		for(int i =0;i<ar.length;i++)
		{
			System.out.println("enter your::"+i+"index value");
			ar[i]=sc.nextInt();
			
		}
		for(int j=0;j<ar.length;j++)
		{
	     System.out.println("your::"+j+"::value::"+ar[j]);
			
			
		}
			
			
			
			
		
	}
	
	
	
	
}