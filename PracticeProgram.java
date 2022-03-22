package tamilnadu.chennai;

public class PracticeProgram {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PracticeProgram pp=new PracticeProgram();
		//pp.naturalNumbers();
		//pp.evenNumbers();
		//pp.multipleOfThree();
		//pp.multipleOfFour();
		//pp.multipleNumbers();
		//pp.sqareroot();
		//pp.cuberoot();
		pp.reverseTheDigit(123456);
		
		pp.reverse1(123456);
		pp.reverse2(123456);
		pp.reverse3(123456);

	}private void reverse3(int no) {
		// TODO Auto-generated method stub
		System.out.println("Reverse the digit even numbers only");
		while(no>1)
		{
			System.out.print(no%10+" ");
			no =no/100;
		}
	}
	private void reverse2(int no) {
		// TODO Auto-generated method stub
		int total =0;
		System.out.println("Reverse the digit as triple");
		while(no>12)
		{
			System.out.print(no%1000+" ");
			total =total+no%1000;
			no=no/10;
		}System.out.println();
		System.out.println("Addition of  the digit as triple is "+ total);
	}
	private void reverse1(int no) {
		// TODO Auto-generated method stub
		int total =0;
		System.out.println("Reverse the digit as double");
		while(no>1)
		{
			System.out.print(no%100+" ");
			total =total+no%100;
			no=no/10;
		}System.out.println();
		System.out.println("Addition of the digit as double "+total);
	}
	
	
	private void reverseTheDigit(int no) {
		// TODO Auto-generated method stub
		int count =0;
		int total=0;
		System.out.println("Reverse the Digit is");
		while(no>0)
		{
			System.out.print(no%10+" ");
			count =count+1;
			total =total+no%10;
			no=no/10;
			
		}System.out.println();
		System.out.println("Number of digit is "+count);
		System.out.println("Total of digit is "+total);
	}



	private void cuberoot() {
		// TODO Auto-generated method stub
		int no =1;
		System.out.println("Cube root of first five numbers");
		while(no<=5)
		{
			System.out.println(no*no*no);
			no++;
		}
	}

	private void sqareroot() {
		// TODO Auto-generated method stub
		int no =1;
		System.out.println("Square root of first five numbers");
		while(no<=5)
		{
			System.out.println(no*no);
			no++;
		}
	}

	private void multipleNumbers() {
		// TODO Auto-generated method stub
		int no = 1;
		System.out.println("Multiple of first five numbers");
		while(no<=16)
		{
			System.out.println(no);
			no=no+no;
		}
	}

	private void multipleOfFour() {
		// TODO Auto-generated method stub
		int no=1;
		System.out.println("First five multiple of four");
		while(no<=5)
		{
			System.out.println(no*4);
			no++;
		}
	}

	private void multipleOfThree() {
		// TODO Auto-generated method stub
		int no =1;
		System.out.println("First five multiple of three ");
		while(no<=15)
		{
			no =no+2;
			System.out.println(no+" ");
			no++;
		}
	}

	private void evenNumbers() {
		// TODO Auto-generated method stub
		int no=1;
		System.out.println("First five even numbers");
		while(no<=10)
		{
		no=no+1;
		System.out.println(no+" ");
		no++;
		}
	}

	private void naturalNumbers() {
		// TODO Auto-generated method stub
		int no =1;
		System.out.println("First five natural numbers");
		while(no<=5)
		{
			System.out.println(no+" ");
			no++;
		}
	}

}
