package tamilnadu.chennai;

public class Loop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Loop l =new Loop();
		l.printRow();
		l.printCol();
		l.printRowCol();
		l.printAddRowCol();
		l.printSubRowCol();
	}
	private void printSubRowCol() {		// TODO Auto-generated method stub
		for (int row =5;row>=1;row--)
		{
		for(int col =1;col<=row;col++)	
		{
			System.out.print(row-col+" ");
		}System.out.println();
		}
	}
	private void printAddRowCol() {
		// TODO Auto-generated method stub
		for (int row =5;row>=1;row--)
		{
		for(int col =1;col<=row;col++)	
		{
			System.out.print(row+col+" ");
		}System.out.println();
		}
	}
	private void printRowCol() {
		// TODO Auto-generated method stub
		for (int row =5;row>=1;row--)
		{
		for(int col =1;col<=row;col++)	
		{
			System.out.print(row*col+" ");
		}System.out.println();
		}
	}
	private void printCol() {
		// TODO Auto-generated method stub
		for (int row =5;row>=1;row--)
		{
		for(int col =1;col<=row;col++)	
		{
			System.out.print(col);
		}System.out.println();
		}
	}
	private void printRow() {
		// TODO Auto-generated method stub
		for (int row =5;row>=1;row--)
		{
		for(int col =1;col<=row;col++)	
		{
			System.out.print(row);
		}System.out.println();
		}
	}

}
