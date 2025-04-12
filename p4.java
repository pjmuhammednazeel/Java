//Perform all arithmetic operations on two integer numbers.
import java.util.Scanner;
class p4
    {
        public static void main(String args[])
        {
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter the First number");
            int a=ob.nextInt();
            System.out.println("Enter the Second number");
            int b=ob.nextInt();   
            int sum=a+b;
            int diff=a-b;
            int mul=a*b;
            int div=a/b;
            System.out.println("Sum="+sum);  
            System.out.println("DIFF="+diff);
            System.out.println("mul="+mul);
            System.out.println("div="+div);   
        }
    }
