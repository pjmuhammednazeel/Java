//Program to check alphabet, digit or special character
import java.util.Scanner;
class p15
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the value");
        char ch=ob.next().charAt(0);
        if((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z'))
        {
            System.out.println("The value entered is alphabet");        
        }    
        else if(ch >= '0' && ch <= '9')
        {
            System.out.println("The value entered is digit");        
        }
        else
        {
            System.out.println("The value entered is special charecter");        
        }
    }    
}
