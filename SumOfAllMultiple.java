package hcl.com.ebox;

public class SumOfAllMultiple {
	public static void main(String[] args)
	{
		int sum=0;
		for(int i=1;i<1000;i++)
		{
			if(i%3==0 || i%5==0)
			{
				sum=sum+i;
			}
		}
		System.out.print("Multiple of 3 and 5 and their sum is:"+sum);
	}

}
