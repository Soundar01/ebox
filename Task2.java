package Assignments;

import java.util.ArrayList;
import java.util.List;

public class Task2 {
	List<Integer> A1=new ArrayList<Integer>();
	List<Integer> A2=new ArrayList<Integer>();
	public static void main(String[] args)
	{
		Task2 t2=new Task2();
		System.out.println(t2.storeEvenNumber(20));
		System.out.println(t2.printEvenNumbers());
		System.out.println(t2.retrieveEvenNumber(8));
	}
	
	public List<Integer> storeEvenNumber(int N)
	{
		
		for(int i=2;i<=N;i=i+2)
		{
			A1.add(i);
		}
		return A1;
	}
	public List<Integer> printEvenNumbers()
	{
		for(int i=0;i<A1.size();i++)
		{
			A2.add(A1.get(i)*2);
		}
		return A2;
	}
	public int retrieveEvenNumber(int N)
	{
		if(A2.contains(N))
		{
			return N;
		}
		else
		{
			return 0;
		}
	}
	
}
