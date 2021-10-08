package hcl.com.ebox;

import java.util.Scanner;

public class Factorial {
	public static int factorial(int n)
	{
		int num=1;
		for(int i=1;i<=n;i++)
		{
			num=num*i;
		}
		return num;
	}
	public static void main(String[] args) {
		int n,fact;
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		fact=factorial(n);
		System.out.println(fact);

	}

}
