package hcl.com.ebox;

public class EvenFibonacci {
	public static void main(String[] args)
	{
		int n=0;
		for(int i=0;i<=4000000;i++)
		{
			if(i%2==0)
			{
				n=n+i;
			}
		}
		System.out.println("Sum of Fibonacci even series of 4 million is:"+n);
	}

}
