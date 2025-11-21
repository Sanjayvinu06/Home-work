import java.util.Scanner;
class ArayFunctions
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		int len=sc.nextInt();
		int array[]=new int[len];
		ArayFunctions obj=new ArayFunctions();
		obj.sum (array);
		
		
			
	}
	void sum (int array[])
	{
	Scanner sc=new Scanner(System.in);
	for(int i=0;i<array.length;i++)
	{
		array[i]=sc.nextInt();
	}
	for(int j=0;j<array.length;j++)
	{
		System.out.println(array[j]);
		
	}
	
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
}