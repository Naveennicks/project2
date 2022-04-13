package tamilnadu.chennai;

import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TwoDimensionalArray t =new TwoDimensionalArray();
		t.array2Dim();
		Scanner sc =new Scanner(System.in);
	}

	private void array2Dim() {
		// TO DO Auto-generated method stub
		String[] exam = {"Quarterly Exam","Halferly Exam","Annual Exam"};
		int[][] marks =new int[3][5];
		int[][] []marks2 =new int[2][3][5];
	/*	System.out.println(marks2.length);
		System.out.println(marks2[0].length);
		System.out.println(marks2[0][0].length);*/
		Scanner sc =new Scanner(System.in);
		
		for(int row =0;row<3;row++)
		{
			int total=0;
			for(int col=0;col<5;col++)
			{
				System.out.println("Enter Mark");
				marks[row][col]=sc.nextInt();
				
				total=total+marks[row][col];
				
			}
			System.out.println("Total is "+  total);
		}
		for(int row =0;row<3;row++)
		{
			System.out.println(exam[row]+" ");
			for(int col=0;col<5;col++)
			{
				System.out.print(marks[row][col]+" ");
			}
			System.out.println();
		}
	}

	

}
