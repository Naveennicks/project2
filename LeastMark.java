package tamilnadu.chennai;

public class LeastMark {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subject = {"Tamil","English","Maths","Science","Social"};
		int[] marks = {50,89,78,89,88};
		int least =100;
		for(int i =0;i<marks.length;i++)
		{
			if(marks[i]<least)
				least=marks[i];
		}
System.out.println(least);
       for(int i=0;i<marks.length;i++)
       {
    	   if (least==marks[i])
    		   System.out.println("Least "+ subject[i]);
       }

	}

}
