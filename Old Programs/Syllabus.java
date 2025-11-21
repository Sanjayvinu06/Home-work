import java.util.Scanner;
class Syllabus
{
	public static void main(String [] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("1.Tamil");
		System.out.println("2.English");
		System.out.println("3.Science");
		System.out.println("4.Social");
		System.out.println("enter your option");
		int opt=sc.nextInt();
		if(opt==1)
		{
			System.out.println("1.ilakanam");
			System.out.println("2.seiyul");
			System.out.println("3.kavithai");
			System.out.println("enter your option");
			int op=sc.nextInt();
			if(op==1)
			{
			System.out.println("illakanam padika va");
			}
			else if(op==2)
			{
						System.out.println("seiyul padika vaa");
			}
			else if(op==3)
			{
						System.out.println("kavithai padikava");
			}
			
		}
		else if(opt==2)
		{
			
			
			
			
		}
		else
		{
					System.out.println("parama padi da");

		}

		
		
		
		
		
	}
	
	
}