//Write a program to create a directory and check whether the directory is
//created.
import java.io.File;
import java.util.Scanner;
import java.io.IOException;
class p25_2
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the file");
        String file = ob.nextLine();
        File d = new File(file);
        if(d.mkdir())
        {
           
            System.out.println("Directory is created");    
        }
        else
        {
            System.out.println("Error occured");    
        }
            
    }
}
