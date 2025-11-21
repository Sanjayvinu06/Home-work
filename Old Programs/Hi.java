port java.util.Scanner;
class Wednesday1
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("enter the strating number :");
		int start=sc.nextInt();
		System.out.print("enter the ending number :");
		int end=sc.nextInt();
		do
		{
			
			System.out.println(end);
			end--;
		}
		while(end>=start);
		
		
	}
	
}
