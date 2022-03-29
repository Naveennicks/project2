package tamilnadu.chennai;

public class PrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =2;
		int div=2;boolean prime=true;
		
		while(div<no) {
		if(no%div==0)
		{
			System.out.println(no+"Not Prime");
			prime =false;
			break;
		}div++;
		}
		if (prime==true) {
			System.out.println(no+"Prime");
		}

	}	
}