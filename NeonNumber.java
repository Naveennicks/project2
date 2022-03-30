package tamilnadu.chennai;

public class NeonNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =9,sum =0;
		int sqr =no*no;
		while(sqr>0)
		{
			int digit =sqr%10;
			sum =sum+digit;
			sqr =sqr/10;
		}
		if(no==sum)
		{
			System.out.println(no+"Neon Number");
		}else
		{
			System.out.println(no+"Not Neon");
		}

	}

}
