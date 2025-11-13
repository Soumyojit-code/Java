import java.util.Scanner;
import java.util.import java.util.Scanner;
import java.util.Arrays;
class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of aaray: ");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements of in unsorted order array:");
            a[i]=sc.nextInt();
        }
        System.out.println("The unsorted array is:");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

      Arrays.sort(a);
        System.out.println("The sorted array is:");
       for(int i=0;i<a.length;i++)
          System.out.print(a[i]+" ");



    }
}s;
class Main
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of aaray: ");
        n=sc.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the elements of in unsorted order array:");
            a[i]=sc.nextInt();
        }
        System.out.println("The unsorted array is:");
        for(int i=0;i<a.length;i++)
            System.out.print(a[i]+" ");

      Arrays.sort(a);
        System.out.println("The sorted array is:");
       for(int i=0;i<a.length;i++)
          System.out.print(a[i]+" ");



    }
}
