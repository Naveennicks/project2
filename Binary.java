package tamilnadu.chennai;

import java.util.Scanner;

public class Binary {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Binary bb =new Binary();
	bb.binaryToDecimal();
		bb.decimalToBinary();
		int po =0;
		while(po<=4)
		{
		int output =bb.powerOfNumber(2,po);
		//System.out.println(output);
		po++;
		}
	}

	private void decimalToBinary() {
		// TODO Auto-generated method stub
		int no =15;
		String binary ="";
		while(no>0)
		{
			binary =binary+(no%2);
			no =no/2;
		}System.out.println(binary);
	}

	private int powerOfNumber(int base,int exp) {
		// TODO Auto-generated method stub
		
		int result =1;
		while(exp>0)
		{
			result =result*base;
		exp--;
		}
		return result;
	
	}
	
	private void binaryToDecimal() {
		// TODO Auto-generated method stub

		int binary =1111;
		int rem =0;
		int pow=0;
		double decimal =0;
		while (binary>0)
		{
			rem=binary%10;
			decimal = decimal+(rem* powerOfNumber(2, pow));

			binary =binary/10;
			pow++;
			
			
		}System.out.println(decimal);
	}

}
