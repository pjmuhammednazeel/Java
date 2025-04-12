//Check whether the given number is odd or even
import java.util.Scanner;
class p5
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");    
        int a=ob.nextInt();
        if(a%2==0)
        {
            System.out.println("Even");        
        }
        else
        {
            System.out.println("Odd");        
        }
        
    }
}
