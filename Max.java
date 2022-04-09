package tamilnadu.chennai;

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] subject = {"Tamil","English","Maths","Science","Social"};
		int[] marks = {50,89,78,89,88};
		int max =0;
		for(int i =0;i<marks.length;i++)
		{
			if(marks[i]>max)
				max=marks[i];
		}
System.out.println(max);
       for(int i=0;i<marks.length;i++)
       {
    	   if (max==marks[i])
    		   System.out.println("highest "+ subject[i]);
       }
	}

}
