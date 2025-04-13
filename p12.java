//Check whether the given number is Armstrong or not
import java.util.Scanner;
class p12
{
    public static void main(String args[])
    {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=ob.nextInt();
        int orgnum=n;
        int arm = 0;
        int rem;
        while(n!=0)
        {
            rem=n%10;
            arm=arm+(rem*rem*rem);
            n=n/10;
                    
        }    
        if(arm==orgnum)
        {
            System.out.println("No is Armstrong");        
        }
        else
        {
            System.out.println("Not armstrong");
        }
    }
}
