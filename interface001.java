//implement interface using inheritance
import java.io.*;
interface  infa
{
    void area();
}
class Circle implements infa
{
    public void area()
    {


            System.out.println("Circle ara");

    }
}
class Rectangle implements infa
{
    public void area()
    {
        System.out.println("Rectangle ara");
    }

}
public class Main
{
    public static void main(String[] args)
    {
        Circle c = new Circle();
        Rectangle r = new Rectangle();

c.area();
r.area();
    }
}

