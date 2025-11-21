import java.util.Scanner;
class Class2
{
	
	
	public static void main(String[] args)
	{
		Class2 obj=new Class2();
		obj.arrays();
		
		
	}
	
	void arrays()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your length");
		int length=sc.nextInt();
		int arr[]=new int[length];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("enter your value");
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		
		
	}
	
	
}