import java.util.Scanner;
class Mahendran
{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.print("enter the starting number:");
	int start=sc.nextInt();
	System.out.print("enter the ending number:");
	int end=sc.nextInt();
		
		while(start<=end)
		{
			System.out.println(start);
			start++;
		}
		
	}
	
	
}