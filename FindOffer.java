package com.hcl;

import java.util.Scanner;

public class FindOffer {

	public static void main(String[] args) {
		int totalprice,offer1,offer2;
		Scanner sc=new Scanner(System.in);
		System.out.println("Cost of price1 is:");
		int prc1=sc.nextInt();
		System.out.println("Cost of price2 is:");
		int prc2=sc.nextInt();
		System.out.println("Cost of price3 is:");
		int prc3=sc.nextInt();
		totalprice=prc1+prc2+prc3;
		offer1=totalprice*(int)0.2;
		if(prc1<prc2 && prc1<prc3)
		{
			offer2=prc1;
		}
		else if(prc2<prc3)
		{
			offer2=prc3;
		}
		else
		{
			offer2=prc3;
		}
		if(offer1>offer2)
		{
			System.out.println("Go to offer1");
		}
		else
		{
			System.out.println("Go to offer2");
		}

}
}