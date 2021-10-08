package hcl.com.ebox;
import java.util.*;
public class TriangleNumbers {
	public static void main(String[] args)
	{
		int n=500,count=0,sum=0;
		Set<Integer> values = new HashSet<Integer>();
		int arr[]=new int[n+1];
		for(int i=1;i<=n+1;i++)
		{
			sum=sum+i;
			count++;
			if(count==500)
			{
				System.out.println("First 500 divisor number is"+sum);
				break;
			}
		}
	}

}
