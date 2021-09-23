package hcl.com.ebox;

public class EvenOddPositions1 {
	public static void main(String[] args)
	{
		int[] arr=new int[] {12,17,19,20,21};
		System.out.print("even:");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0) {
				System.out.print(arr[i]+" ");
				
			}
			
		}
		System.out.println();
		System.out.print("odd:");
		for(int i=1;i<arr.length;i=i+2)
		{
			System.out.print(arr[i]+" s");
		}
		
	}

}
