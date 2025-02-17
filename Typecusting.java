//type custing
class A
{
    static void  m1()
    {
        System.out.println("class A");
    }
}
class B extends A
{
    static void m1()
    {
        System.out.println("class B");
    }

}
class C extends B
{
    static  void m1()
    {
        System.out.println("class C");
    }
}


public class Typecusting
{
    public static void main(String[] args)
    {
        C c=new C();
        c.m1();
        ((B)c).m1();
        ((A)(B)c).m1();



    }

}
