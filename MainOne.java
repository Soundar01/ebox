package Collection;
import java.util.*;
public class MainOne {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int i=0;
		ArrayList<String> alist=new ArrayList<String>();
		do {
			i++;
			System.out.println("name: "+i);
			String name=sc.next();
			alist.add(name);
			System.out.println("Enter choice y/n:");
			//char choice=sc.next().charAt(0);
		}while(sc.next().equalsIgnoreCase("y"));
		sc.close();
		alist.forEach((a)->System.out.println("Names:"+a));
	}
}
