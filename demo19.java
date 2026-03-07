//even no. alone in reverse
class demo19 
{
	public static void main(String[] args) 
	{
		int a[]={5,10,15,20,30,45};
		for (int i=a.length-1;i>0;i-- )
		{
			if (a[i]%2==0)
			{
				System.out.println(a[i]);
			}
		}
		
	}
}
