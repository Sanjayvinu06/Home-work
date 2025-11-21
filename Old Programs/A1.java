class A1
{
	public static void main(String [] args)
	{
		int arr[]={10,20,30,40};
		A1 obj=new A1();
		obj.arrayfunction(arr);
	
	}
	
	
	void arrayfunction(int ar[])
	{
		for(int i=ar.length-1;i>=0;i--)
		{
			
			System.out.println(ar[i]);
			
		}
		
		
	}
}