
//Remove 'would ' from 'helloworld' using StringBuffer.

public class String3

{
    public static void main(String[] args)
    {
        StringBuffer s= new StringBuffer("helloworld");
        s.delete(5,s.length());
        System.out.println(s);
    }


}