//Find the factorial of a number
import java.util.Scanner;
class p9
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        int a=ob.nextInt();
        int fact=1;
        for(int i=1;i<=a;i++)
        {
            fact=fact*i;        
        }
        System.out.println("Factorial="+fact);    
    }
}
