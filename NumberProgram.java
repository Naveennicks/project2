package tamilnadu.chennai;

public class NumberProgram {

	public static void main(String[] args) {
		NumberProgram np =new NumberProgram();
		//np.reverse();
		//np.squareNum();
		np.decimaltobinary();


	}

	private void decimaltobinary() {
		// TODO Auto-generated method stub
		int decimal=8,rem;
		String binary ="";
		while(decimal>0)
		{
			rem =decimal%2;
			binary =rem+binary;
			decimal=decimal/2;
		}System.out.println(binary);
	}

	private void squareNum() {
		// TODO Auto-generated method stub
		int no =1;
		while(no<5)
		{
			System.out.println(Math.pow(no, no));
			no++;
		}
	}

	private void reverse() {
		// TODO Auto-generated method stub
		int no =1551;
		int rem=0,no2=no;
		while(no>0)
		{
			rem =(rem*10)+no%10;
			no=no/10;
		}System.out.println(rem);
		if(no2==rem)
		{
			System.out.println("Palindrom");
		}else {
			System.out.println("Not Palindrom");
		}
		
	}

}
