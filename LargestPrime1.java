package hcl.com.ebox;
import java.util.*;
public class LargestPrime1 {
	public static void main(String[] args)
	{
		long n=600851475143L;
		Set<Integer> values = new HashSet<Integer>();
		for(int i=2;i<=n;i++)
		{
			if(n%i==0)
			{
				System.out.println(i+"");
				n/=i;
				values.add(i);
			}
		}
		Object obj = Collections.max(values);
	    System.out.println("Largest prime factor = "+obj);
	
	}

}
