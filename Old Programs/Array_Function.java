class Array_Function
{
	public static void main(String [] args)
	{
		int arr[]={1,2,3,4};
		Array_Function obj=new Array_Function();
		obj.arrayfunction(arr);
		
		int res[]=obj.reverArray(arr);
		
		for(int i=0;i<res.length;i++)
		{
				System.out.println(res[i]);
		}
		

	
	}
	
	
	void arrayfunction(int ar[])
	{
		for(int i=ar.length-1;i>=0;i--)
		{
			
			System.out.println(ar[i]);
			
		}
		
		
	}
	int[] reverArray(int arr[])
	{
		int brr[]=new int[arr.length];
		int j=0;
		
		for(int i=arr.length-1;i>=0;i--)
		{
			
			brr[j]=arr[i];
			j++;
			
		}
		return brr;
		
		
		
	}
}