package tamilnadu.chennai;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ScannerDemo sd =new ScannerDemo();
		sd.milk();
		sd.vendor();
		sd.ebBill();

	}

	private void ebBill() {
	    Scanner sc=new Scanner(System.in);
		float price ;
		System.out.println("Enter the unit");
		int unit =sc.nextInt();
		//System.out.println("Enter price of one unit");
		//float unitPrice =sc.nextFloat();
		float unitPrice;
		//System.out.println("Government free scheme for commercial purpose first 100 unit is free");
	    if(unit<=100)
	    {
	    	System.out.println("Government free scheme for commercial purpose first 100 unit is free");
	    }
	    else if(unit>100 &&unit<=200)
	    {   unitPrice =1.5f;
	    	System.out.println("The first 100 unit is free and the remaining is 1.5RS per unit");
	    	price =(unit-100);
	    	System.out.println("The EB bill is "+(price*unitPrice));
	    }else
	    {
	    	unitPrice =3;
	    	System.out.println("Unit crossed above 200 the first 100 unit is free and remaining per unit is 3RS");
	    	price =(unit-100);
	    	System.out.println("The EB bill is "+(price*unitPrice));
	    }
		
	}

	private void vendor() {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the amount for chengalpat to mylapor train ticket ");
		int ticket =sc.nextInt();
		System.out.println("Enter the days travel");
		int days =sc.nextInt();
		System.out.println("Did you taken season ticket");
		boolean tkt =sc.nextBoolean();
		System.out.println("Enter the price of season ticket for 90 days");
		int price =sc.nextInt();
		System.out.println("Your normal ticket price is "+((ticket*days)));
		System.out.println("Season ticket price "+price);
		System.out.println("Your profit is "+((ticket*days)-(price)));
	}

	private void milk() {
		// TODO Auto-generated method stub
		int avin;
		int privt;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter private milk rate");
		int p=sc.nextInt();
		System.out.println("Enter  Aavin milk rate");
		int a =sc.nextInt();
		System.out.println("No of days milk buying");
		int days =sc.nextInt();
		System.out.println("Transport charge for aavin milk");
		int t =sc.nextInt();
		System.out.println("if you buy private milk "+(p*days));
		System.out.println("if you buy Aavin milk "+((a*days)+t));
		System.out.println("Profit is "+(((p*days)-((a*days+t)))));
		avin=(a*days+t);
		privt=(p*days);
		if(avin>privt)
		{
			System.out.println("Your profit to bye privt milk is "+(((p*days)-((a*days+t)))));
		}
		else if(privt>avin)
		{
			System.out.println("Your profit to buy avin milk is "+(((p*days)-((a*days+t)))));	
		}
	}

}
