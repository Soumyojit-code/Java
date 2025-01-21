class stu_a
{ int b;
    stu_a(){}
    stu_a(int bb)
    {

        this.b=bb;
    System.out.println("class stu_A: "+b);

    }
}
class stu_b extends stu_a

{
    int a;
    stu_b(){}
    stu_b(int bb,int a1)
    {
        super(bb);
        this.a=a1;
        System.out.println("class stu_B: "+a);
    }
}
class stu_c extends stu_b
{
    int a;
    stu_c(){}
    stu_c(int bb,int a1,int a2)
    {
        super(bb,a1);
        this.a =a2;

        System.out.println("class stu_C: "+a);
    }

}

public class hehe {
    public static void main(String[] args)
    {
        System.out.println("single lavel inheritance");
        stu_b A= new stu_b(1,2); //single lavel inheritance
        System.out.println("Multi lavel inheritance");
        stu_c B=new stu_c(3,4,5);


    }
}
