import java.util.Scanner;
class Test{
   void sort(int a[])
   {
       int n=a.length;
       for(int i=0;i<n;i++)
       {
           int min_el=i;

           for(int j=i+1;j<n;j++)
           {
               if(a[j]<a[min_el])
                   min_el=j;
           }
           if(min_el!=i)
           {
               int temp=a[min_el];
               a[min_el]=a[i];
               a[i]=temp;

           }
       }
   }

   public static void main(String args[])
   {
       Scanner sc= new Scanner(System.in);
       System.out.println("Enter the size of the array");
       int n= sc.nextInt();
       int[] a = new int[n];
       int c=0;
           for(int i=0;i<n;i++)
           {
               System.out.println("Enter the elements of the array");
                a[i]= sc.nextInt();
           }

       Test t=new Test();
       t.sort(a);
      System.out.println("Sorted Array");
      for(int i=0;i<n;i++)
      {
          System.out.print(a[i]+" ");
      }
 System.out.println(c);

   }
}
