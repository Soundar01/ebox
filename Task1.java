package Assignments;

import java.util.HashSet;
import java.util.Iterator;

public class Task1 {

	public static void main(String[] args) {
		Task1 t1=new Task1();
		
		storeCountryNames("India","USA","Swiss");
	}
         static HashSet storeCountryNames(String c1,String c2, String c3) {
        	
     		HashSet<String> H1=new HashSet<String>();
 			H1.add(c1);
 			H1.add(c2);
 			H1.add(c3);
 			
 			//return H1;
 			
 			Iterator<String> i=H1.iterator();
 	         while(i.hasNext())  
 	         {  
 	         System.out.println(i.next());  
 	         } 

 	         if(H1.contains("India")){

 	        	 System.out.println("Hash Set Contains 'India'");

 	         }

 	         else{

 	        	 System.out.println("Hash Set Do not Contains 'India'");
 	         }
 	         return H1;
 		}

	

}
