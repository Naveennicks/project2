package tamilnadu.chennai;

public class ArraySwap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArraySwap as=new ArraySwap();
		//as.leftSwap();
		as.rightSwap();

	}

	private void rightSwap() {
		// TODO Auto-generated method stub
		String []friends= {"saju","Biju","Viju","Manu","Vinu"};
		System.out.println("Before :");
		for(int i =0;i<friends.length;i++)
		{
			System.out.print(friends[i]+" ");
		}
		int len =friends.length;
		String temp =friends[len-1];int i =1;
		for( i =1;i<friends.length;i++)
		{
			friends[len-i]=friends[len-(i+1)];
		}friends[len-i]=temp;
		System.out.println();
		System.out.println("After :");
		for( i =0;i<friends.length;i++)
		{
			System.out.print(friends[i]+" ");
		}
		
	}

	private void leftSwap() {
		// TODO Auto-generated method stub
		String []friends= {"saju","Biju","Viju","Manu","Vinu"};
		System.out.println("Before :");
		for(int i =0;i<friends.length;i++)
		{
			System.out.print(friends[i]+" ");
		}
		String temp =friends[0];int i=0;
		for(;i<friends.length-1;i++)
		{
			friends[i]=friends[i+1];
		}
		friends[i]=temp;
		System.out.println();
		System.out.println("After :");
		for(i =0;i<friends.length;i++)
		{
			System.out.print(friends[i]+" ");
		}
		
	}

}
