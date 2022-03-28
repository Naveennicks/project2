package tamilnadu.chennai;

public class ARMSTRONG {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int no =1634;
		int rem =0,arm=0,no1=no;
		while(no>0)
		{
			rem =no%10;
			arm =arm+(rem*rem*rem*rem);
			no=no/10;
		}
		if(arm==no1)
		{
			System.out.println(arm +"is armstrong");
		}else {
			System.out.println(arm+"Not armstrong");
		}

	}

}
