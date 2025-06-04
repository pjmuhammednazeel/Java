//Find the average of N positive integers, raising a user defined
//exception for each negative input.
import java.util.Scanner;
class negative extends Exception
{
    negative(String message)
    {
        super(message);
    }
}
class p21_4
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        try
        {
            System.out.println("Enter the limit");
            int n = ob.nextInt();
            if(n<=0)
            {
                throw new negative("Eror");    
            }
        }    
        catch(negative e)
        {
            System.out.println(""+e.getMessage());    
        }
    }
}
