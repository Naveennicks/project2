package tamilnadu.chennai;

public class FirstLastOccur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {1,0,5,18,5,5,5,21,16};
		int key =5;int first=0;int last=0;
		for(int i =0;i<ar.length;i++)
		{
			if(key ==ar[i]) 
			{				
				first =i;
				break;
			}
		}System.out.println("First occurs in"+first);
		for(int i =ar.length-1;i<ar.length;i--)
		{
			if(key ==ar[i]) 
			{				
				last =i;
				break;
			}
		}System.out.println("Last occurs in"+last);
		
	}

}
