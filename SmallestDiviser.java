package hcl.com.ebox;
import java.lang.*;
public class SmallestDiviser 
{
	public static void main(String[] args) 
	{
		int n,s;
		 for (n = 21; n > 0; n++) 
		 {
			 boolean divisibleByAll = true;
		     for (int m = 1; m <= 20; m++) 
		     {
		    	 s = n % m;
		    	 if(s != 0) 
		    	 {
		    		 divisibleByAll = false;
		    	     break; 
		         }
		     }
		        if (divisibleByAll)
		        {
		            System.out.println(n);
		            break;
		        }
		 }
	}
}
		 