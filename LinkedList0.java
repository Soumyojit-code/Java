import java.util.LinkedList;
import java.util.Collections;
public class List0
{
    public static void main(String [] args)
    {
        LinkedList<String> cars = new LinkedList<String>();

        LinkedList<String> ab = new LinkedList<String>();

        cars.add("1");
        cars.add("2");
        cars.add("4");
        ab.add("1");
        ab.add("3");
        ab.add("4");

        cars.addAll(ab);
        Collections.sort(cars);

        System.out.println(cars);


    }
}
