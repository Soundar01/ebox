package hcl.com.ebox;

public class Euler15 {
	public static void main(String[] args)
	{
		int n=40,k=20;
		if (k > (n-k))
			k = n - k;
		long c = 1;
		for (int i = 0; i < k; i++)
		{
			c = c * (n-i);
			c = c / (i+1);			
		}
 
			System.out.println("Num of routes in 20x20 grid: "+c);
	}

}
