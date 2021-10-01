package hcl.com.ebox;
import java.util.*;
public class FirstNPrime {
	public static void main(String[] args) 
	{
	    int n = 2;
	    Set<Integer> values = new HashSet<Integer>();
	    for(int i = 0; i <= 10001; i++)
	    {
	        int count = 0;

	        for(int j = 1; j <= n; j++)
	            if(n%j == 0)
	                count++;

	        if(count == 2)
	            
	        	values.add(n);
	        n++;
	    }
	    Object obj = Collections.max(values);
	    System.out.println("10001st prime number = "+obj);
	}

}
