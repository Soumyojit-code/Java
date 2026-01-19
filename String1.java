//reverse a string
import java.util.Scanner;
public class String1
{
    public static void main(String[] args)
{
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter a string");
    String str= sc.nextLine();
    StringBuffer sb= new StringBuffer(str);
    sb.reverse();
    System.out.println("Reverse string:"+sb);

}
}