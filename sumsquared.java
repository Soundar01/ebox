package hcl.com.ebox;

public class sumsquared
{
	public static void main(String[] args) 
	{
		
		int num=10,sum=0,sqr=0;
		for (int i = 1; i <= num; i++)
		{
			sum =sum + i;
			sqr += i * i;
		}
		int diff=sum*sum-sqr;
		System.out.println("Sum squared difference is:"+diff);
	}
}