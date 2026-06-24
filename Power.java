package number;

public class Power {
	public static int powerofnumber(int num,int pow)
	{
		int n=1;
		while(pow!=0)
		{
			n*=num;
			pow--;
		}
		return n;
	}
	public static void main(String[] args)
	{
		 
		  System.out.println(powerofnumber(5,3));
	}
}
