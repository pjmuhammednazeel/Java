//Find the sum of the digits of a given number
import java.util.Scanner;
class p7
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the digit");
        int n=ob.nextInt();
        int sum=0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }   
        System.out.println("Sum of digits="+sum);
    }
}
