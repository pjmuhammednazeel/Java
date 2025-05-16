//Write a java program for implementing user defined exception
//Hint:- create a user defined exception called InvalidAgeException where if
//the user age < 18 then throw the exception otherwise display “you are
//eligible to vote”
import java.util.Scanner;
class invalid extends Exception
{
    invalid(String message)
    {
           super(message); 
    }
}

public class p20_3
{
    public static void main(String args[])
    {
        try
        {
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter the age");
            int age = ob.nextInt();    
            if(age<18)
            {
                throw new invalid("you cant vote");    
            }    
            else 
            {
                System.out.println("u can bote");    
            }
        } 
        catch (invalid e)
        {
            System.out.println(e.getMessage());        
        }   
    }
}
