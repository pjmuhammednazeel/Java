//Print the Fibonacci Series up to a limit
import java.util.Scanner;
class p6
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n=ob.nextInt();
        int a=0;
        int b=1;
        for(int i=0;i<n;i++)
        {
            System.out.println(""+a);
            a=a+b;
            b=i;       
        }    
    }
}
