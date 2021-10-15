package hcl.com.ebox;

public class Euler16 {
	public static void main(String[] args)
	{
	int sum=0;
	int num = (int) Math.pow(2, 1000);
	System.out.println(num);
	while(num > 0)  
	{  
		int digit = num % 10;  
		sum = sum + digit;  
		num = num / 10;
		//System.out.println(sum);
	}  
	System.out.println(sum);
	}

}
