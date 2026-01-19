//Check if a String is plaindrom or not
import java.util.Scanner;
public class String2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = sc.nextLine();
        StringBuffer sb = new StringBuffer(s);
        sb.reverse();
        System.out.println(sb);
        if(s.equals(sb.toString())) //to string is a method use
                                     // to convart an obj to into it's str representation
        {
            System.out.println("String is plaindrom ");
        }
        else
        {
            System.out.println("String is not plaindrom ");
        }

    }
}