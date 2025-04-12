//Check whether the given number is prime or not
import java.util.Scanner;
class p8
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number");
        int a=ob.nextInt();
        int flag=0;
        for(int i=1;i<=a;i++)
        {
            if(a%i==0)
            {
                flag=flag+1;               
            }        
        }    
        if(flag<3)
        {
            System.out.println("Number is  Prime");        
        }
        else
        {
            System.out.println("number is not prime");        
        }
    }
}
