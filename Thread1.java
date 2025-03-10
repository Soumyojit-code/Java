          import java.util.Scanner;
             class  Addtion extends Thread
             {
                 private int a1,a2;
                 public  Addtion(int num1,int num2)
                 {
                     this.a1=num1;
                     this.a2=num2;

                 }


                     public void run()
                     {
                         int sum=a1+a2;
                         System.out.println("Addtion of: "+a1+"+"+a2+" = "+sum);

                     }


             }
             class Subtraction extends Thread
             {
                 private int s1,s2;
                 public Subtraction(int num1,int num2)
                 {
                     this.s1=num1;
                     this.s2=num2;
                 }
                 public void run()
                 {
                     int sub=s1-s2;
                     System.out.println("Subtraction of: "+s1+"-"+s2+" = "+sub);
                 }
             }
             class Multiplication extends Thread
             {
                 private int b1,b2;
                 public Multiplication(int num1,int num2)
                 {
                     this.b1=num1;
                     this.b2=num2;
                 }
                 public void run()
                 {
                     int Mul=b1*b2;
                     System.out.println("Multiplication of: "+b1+"x"+b2+" = "+Mul);
                 }
             }
             class Division extends Thread
             {
                 private int c1,c2;

                     public Division(int a1,int a2)
                     {
                         this.c1=a1;
                         this.c2=a2;
                     }
                     public void run()
                     {
                         int Div=c1/c2;
                         System.out.println("Division of: "+c1+"/"+c2+" = "+Div);
                     }

             }


class Thread1
       {
          public static void main(String[]args)
          {
              Scanner sc=new Scanner(System.in);
              System.out.println("Enter the first number");
              int n1=sc.nextInt();
              System.out.println("Enter the second number");
              int n2=sc.nextInt();
              Addtion  A=new  Addtion(n1,n2);
              A.start();
              Subtraction S=new  Subtraction(n1,n2);
              S.start();
              Multiplication M = new Multiplication(n1,n2);
              M.start();
              Division D = new Division(n1,n2);
              D.start();

         }

       }
