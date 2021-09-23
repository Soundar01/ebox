package hcl.com.ebox;
import java.lang.*;
public class StringBuilder1 {
	public static void main(String[] args)
	{
		StringBuilder sb=new StringBuilder("Hello");  
		sb.append(" World");  
		System.out.println(sb);
		sb.insert(5, "_Java");
		System.out.println(sb);
		sb.replace(5, 6, " ");
		System.out.println(sb);
	}

}
