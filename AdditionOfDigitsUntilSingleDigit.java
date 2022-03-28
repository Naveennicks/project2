package tamilnadu.chennai;

public class AdditionOfDigitsUntilSingleDigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =85585;int rem;
		int total=no; 
		while(total>9)
		{
			no =total;
			total =0;
			while(no>0)
			{
			rem =no%10;
			total =total +rem;
			no =no/10;
			}
		}System.out.println(total);

	}

}
