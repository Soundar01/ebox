package hcl.com.ebox;

public class EvenOdd
{
	public static void main(String[] args)
	{
		int[] arr=new int[] {12,17,19,20,21};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("Even:"+arr[i]);
			}
			else
			{
				System.out.println("Odd:"+arr[i]);
			}
		}
	}

}
