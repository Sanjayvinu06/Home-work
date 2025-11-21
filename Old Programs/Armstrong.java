class Armstrong
{
	public static void main(String[] args)
	{
		int a=143;
		int b=a%10;
		int c=a/10;
		int d=c%10;
		int e=c/10;
		int f=b*b*b + d*d*d +e*e*e;
		boolean result=f==a;
		System.out.println("the given number is :"+a+" armstrong or not :"+result);
		
		
		
		
	}
	
	
	
}