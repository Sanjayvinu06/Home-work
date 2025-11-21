import java.util.Scanner;
class Wednesday 

{
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	System.out.print("enter the starting day :");
	int start=sc.nextInt();
	System.out.print("enter the ending day:");
	int end=sc.nextInt();
		
		while(start<=end)
		{
			System.out.println(start);
			start++;
		}
		
	}
	
	
}