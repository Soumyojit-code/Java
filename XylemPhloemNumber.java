package number;

public class XylemPhloemNumber 
{
	public static Boolean Digit(int num)
	
	{
		int s1=num%10;
		num/=10;
		int s2=0;
		
	      while(num>9) 
	      {
	          s2=s2+num%10;
	          num=num/10;
	       }
	       s1=s1+num;
	       if(s1==s2)
	          return true;
	       else

		return false;
	}



public static void main(String[] args)
{
	 System.out.println("is the number Xylem number: ");	
	  System.out.println(Digit(123425));
}

}
