//Check whether the given number is palindrome or not
import java.util.Scanner;
class p13
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = ob.nextInt();
        int orgnum = n;
        int pal=0;
        int rem=0;
        while(n!=0)
        {
            rem=n%10;
            pal=pal*10+rem;
            n=n/10;       
        }
        if(orgnum==pal)
        {
            System.out.println("No is palindrome");        
        }
        else
        {
            System.out.println("No is not palindrome");        
        }
    }
}
