class Function
{
	public static void main(String []args)
	{
		Function obj=new Function();
		obj.add(10,20);
		obj.add(40,50);
		int res=obj.sub(20,30);
		System.out.println(res);
		System.out.println(obj.sub(10,5));
		
	}
	void add(int a,int b)
	{
		int c=a+b;
		
		
		System.out.println(c);
		
	}
	int sub(int a,int b)
	{
		int c=a-b;
		return c;
		
	}
	
	
	
	
	
}