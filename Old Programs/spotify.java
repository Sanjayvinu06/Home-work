import java.util.Scanner;

class Spotify
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("welcome to spotifyyyyy");
		System.out.println("1.for rahuman");
		System.out.println("2.for aniruth");
		System.out.println("3.for harris");
		System.out.println("4.for yuvan");
		System.out.print("CHOOSE ANY SINGER:");
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("1.for kuthu");
		    System.out.println("2.for sad");
		    System.out.println("3.for melody");
		    System.out.println("4.for motivational");
			System.out.print("CHOOSE ANY PLAYLIST:");
			int choose=sc.nextInt();
			if(choose==1)
			{
				System.out.println("rahuman kuthu");
			}
			else if(choose==2)
			{
				System.out.println("rahuman sad");
			}
			else if(choose==3)
			{
				System.out.println("rahuman melody");
			}
			else if(choose==4)
			{
				System.out.println("rahuman motivational");
			}
			else
			{
				System.out.print("there is no playlist:");
			}
			
			
		}
		else if(choice==2)
		{
			System.out.println("1.for kuthu");
		    System.out.println("2.for sad");
		    System.out.println("3.for melody");
		    System.out.println("4.for motivational");
			System.out.print("CHOOSE ANY PLAYLIST:");
			int choose=sc.nextInt();
			if(choose==1)
			{
				System.out.println("aniruth kuthu");
			}
			else if(choose==2)
			{
				System.out.println("aniruth sad");
			}
			else if(choose==3)
			{
				System.out.println("aniruth melody");
			}
			else if(choose==4)
			{
				System.out.println("aniruth motivational");
			}
			else
			{
				System.out.print("there is no playlist:");
			}
		}
		else if(choice==3)
		{
			System.out.println("1.for kuthu");
		    System.out.println("2.for sad");
		    System.out.println("3.for melody");
		    System.out.println("4.for motivational");
			System.out.print("CHOOSE ANY PLAYLIST:");
			int choose=sc.nextInt();
			if(choose==1)
			{
				System.out.println("harris kuthu");
			}
			else if(choose==2)
			{
				System.out.println("harris sad");
			}
			else if(choose==3)
			{
				System.out.println("harris melody");
			}
			else if(choose==4)
			{
				System.out.println("harris motivational");
			}
			else
			{
				System.out.print("there is no playlist:");
			}
		}
		else if(choice==4)
		{
			System.out.println("1.for kuthu");
		    System.out.println("2.for sad");
		    System.out.println("3.for melody");
		    System.out.println("4.for motivational");
			System.out.print("CHOOSE ANY PLAYLIST:");
			int choose=sc.nextInt();
			if(choose==1)
			{
				System.out.println("yuvan kuthu");
			}
			else if(choose==2)
			{
				System.out.println("yuvan sad");
			}
			else if(choose==3)
			{
				System.out.println("yuvan melody");
			}
			else if(choose==4)
			{
				System.out.println("yuvan motivational");
			}
			else
			{
				System.out.print("there is no playlist:");
			}
		}
		else
		{
			System.out.println("there is no singer");
		}
		
	}
}