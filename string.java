// Write a program in Java to Print a string 10 times using a for loop.
import java.util.Scanner;
public class string
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to 10 times ");
        String sr = sc.nextLine();
        int i;
        for ( i=1;i<=10;i++)
        {
            System.out.println(i+": "+sr);
        }

    }
}
