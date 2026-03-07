//find highest the sum of odd and even no. in an array 
class demo20  
{
	public static void main(String[] args) 
	{
		int a[]={5,10,15,20,30,45};
		int e=0,o=0;
		for (int i=0;i<a.length-1;i++)
		{
			if (a[i]%2==0)
			{
				e+=a[i];
			}
			else
			{o+=a[i];}
		}
		if (e>o)
		{
			System.out.println("even is high="+e);
		}
		else
		{
			System.out.println("odd is high="+o);
		}
	}
}
