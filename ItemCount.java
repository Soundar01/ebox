package hcl.com.ebox;
import java.util.*;
public class ItemCount {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,fur=0,elc=0;
		System.out.println("Enter the number of items: ");
		n=sc.nextInt();
		System.out.println("Enter item details(Supplier name followed by the item code followed by the item type key:");
		for(int i=0;i<n;i++)
		{
			String item=sc.next();
			int l=item.length();
			if((item.substring(l-3)).endsWith("FUR"))
			{
				fur++;
			}
			if((item.substring(l-2)).endsWith("EL"))
			{
				elc++;
			}
		}
		System.out.println("Furniture items count:"+fur);
		System.out.println("Electrnics item count:"+elc);
		

	}

}
