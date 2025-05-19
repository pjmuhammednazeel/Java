//Write a user defined exception class to authenticate the user name and password?
import java.util.Scanner;
class authenticate extends Exception
{
    authenticate(String message)
    {
        super(message);    
    }
}

class p21_3
{
    public static void main(String args[])
    {
        String username = "nazeel";
        String password = "123";
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter username");
        String u = ob.nextLine();
        System.out.println("Enter password");
        String p = ob.nextLine();
        try
        {
            if(!username.equals(u))
            {
                throw new authenticate("Invalid username");    
            }    
            if(!password.equals(p))
            {
                throw new authenticate("Invalid password");    
            }
        
        System.out.println("Login successful");
        }        
        catch(authenticate e)
        {
            System.out.println("Eror="+e.getMessage());    
        }
        
            
    }
}
