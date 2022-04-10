package tamilnadu.chennai;

public class PrintName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintName pn =new PrintName();
		pn.printR();
		pn.printN();
		pn.printA();
		pn.printV();
		pn.printE();
		pn.printE();
		pn.printN();
		

	}

	private void printE() {
		// TODO Auto-generated method stub
		for(int row =1;row<=7;row++)
		{
			for(int col =1;col<=7;col++)
			{
				if(row==1||col==1||row==4||row==7)
				System.out.print("* ");
				else
					System.out.print(" ");
			}System.out.println();
			
		}
		
	}

	private void printV() {
		// TODO Auto-generated method stub
		for(int row =1;row<=7;row++)
		{
			for(int col=1;col<=row;col++)
			{if(col==row)
				System.out.print("* ");
			else
				System.out.print("  ");
			} for(int at =7-row;at>0;at--)
			{
				System.out.print("    ");
			}
			System.out.print("*");
			System.out.println();
		}
		
	}

	private void printA() {
		// TODO Auto-generated method stub
		for(int col =1;col<=7;col++)
		{
			System.out.print("* ");
		}System.out.println();
		for(int row =1;row<=7;row++)
		{
			for(int col =1;col<=7;col++)
			{
				if(col==1||col==7)
					System.out.print("* ");
				else
					System.out.print("  ");				
			}
			System.out.println();			
		}
	
	for(int col =1;col<=7;col++)
	{
		System.out.print("* ");
	}System.out.println();
	for(int row =1;row<=7;row++)
	{
		for (int col =1;col<=7;col++)
		{
			if(col==1||col==7)
				System.out.print("* ");
			else
			{
				System.out.print("  ");
			}
		}System.out.println();
	}
	}

	private void printN() {
		// TODO Auto-generated method stub
		
		for(int row =1;row<=7;row++)
		{
			for(int col=1;col<=row;col++)
			{if(col==1||col==row)
				System.out.print("* ");
			else
				System.out.print("  ");
			} for(int at =7-row;at>0;at--)
			{
				System.out.print("  ");
			}
			System.out.print("*");
			System.out.println();
		}
		
	}

	private void printR() {
		// TODO Auto-generated method stub
		for(int col =1;col<=7;col++)
		{
			System.out.print("* ");
		}System.out.println();
		for(int row =1;row<=7;row++)
		{
			for(int col =1;col<=7;col++)
			{
				if(col==1||col==7)
					System.out.print("* ");
				else
					System.out.print("  ");				
			}
			System.out.println();			
		}
	
	for(int col =1;col<=7;col++)
	{
		System.out.print("* ");
	}System.out.println();
	for(int row =1;row<=7;row++)
	{
		for(int col=1;col<=row;col++)
		{if(col==1||col==row)
			System.out.print("* ");
		else
			System.out.print("  ");
		}System.out.println();
	}
	
}}