package hcl.com.ebox;
import java.util.*;
public class StringBuffer1 {
	public static void main(String[] args)
	{
		StringBuffer sb=new StringBuffer("Hello");
		sb.append(" World");
		System.out.println(sb);
		sb.insert(5, "_Java");
		System.out.println(sb);
		sb.replace(5, 6, " ");
		System.out.println(sb);
		System.out.println(sb.charAt(6));
		System.out.println(sb.delete(6, 10));
		System.out.println(sb.capacity());
		System.out.println(sb.reverse());
		
		
	}

}
