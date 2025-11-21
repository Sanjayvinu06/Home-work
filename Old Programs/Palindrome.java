class Palindrome
{
	public static void main(String[] args)
	{
		int a=1346;
		int b=a%10;
		int c=a/10;
		int d=c%10;
		int e=c/10;
		int f=b*100+d*10+e*1;
		boolean res=f==a;
		System.out.println("the given number is :"+a+" panlindrome or not :"+res);
		
		
		
		
		
	}
	
	
	
	
	
}