class FunctionSum
{
	public static void main(String [] args)
	{
		
		FunctionSum obj=new FunctionSum();
		
		obj.add("mahendran",24);
		obj.add("sanjay",21);
		obj.add("udhayabala",21);
		
		int ar[]={1,2,3,4};
		obj.printarray(ar);
		obj.printmax(ar);
		
		
		
		
		
		
	}
	void add(String name,int age)
	{
		System.out.println("your name is::"+name);
		System.out.println("your age is ::"+age);
		
		
	}
	void printarray(int ar[])
	{
	  for(int i=0;i<ar.length;i++)
	  {
		 System.out.println(ar[i]);
		  
	  }
		
		
	}
	
	void printmax(int ar[])
	{
		int max=0;
		for(int i=0;i<ar.length;i++)
		{
			if(max<ar[i])
			{
				max=ar[i];
				
				
			}
			
		}
		System.out.println(max);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}