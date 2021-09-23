package hcl.com.ebox;

public class Strings {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1="Today is awesome day";
		System.out.println(s1.charAt(0));
		System.out.println(s1.compareTo("day"));
		System.out.println(s1.equalsIgnoreCase("Today"));
		System.out.println(s1.length());
		System.out.println(s1.indexOf('w'));
		System.out.println(s1.concat("Have a good day"));
		System.out.println(s1.replace('y','e'));
		System.out.println(s1.substring(2,9));
		System.out.println(s1.trim());

	
	}

}
