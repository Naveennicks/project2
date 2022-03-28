package tamilnadu.chennai;

public class StrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =145;
		int no2=no;int rem;int sum=0,no3;
		while(no>0)
		{
			no3 =no%10;
			int fact =1;
			while(no3>0)
			{
				fact =fact*no3;
				no3=no3-1;
			}
		sum =sum +fact;
		
		no =no/10;
		}if(sum==no2)
		{
			System.out.println(sum+" is strong number");
		}else {
			System.out.println(sum+"not strong number");
		}
	}

}
