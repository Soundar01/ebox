package hcl.com.ebox;
import java.util.*;
public class Maximum {
	public static int findmaximum(int n1,int n2,int n3)
	{
		return n3>(n1>n2?n1:n2)?n3:((n1>n2)?n1:n2);
	}
	public static void main(String args[])
	{
		int n1,n2,n3,max;
		Scanner sc=new Scanner(System.in);
		n1=sc.nextInt();
		n2=sc.nextInt();
		n3=sc.nextInt();
		max=findmaximum(n1,n2,n3);
		System.out.println(max+" is the maximum number");
	}

}
