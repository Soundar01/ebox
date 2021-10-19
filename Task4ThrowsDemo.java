package Assignments;

public class Task4ThrowsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Task4Demo demo=new Task4Demo();
		//demo.division(6, 3);
		int result=0;
		try {
			demo.n1=8;
			demo.n2=4;
			result=demo.division();
		}catch(ArithmeticException ae)
		{
			System.out.println("Arithmetic exception");
		}
		finally {
			System.out.println(result);
		}
	}

}

public class Task4Demo {
	public int n1,n2;
	public int division() throws ArithmeticException
	{
		int result=n1/n2;
		return result;
	}
	

}
