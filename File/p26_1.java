//Write a program to create a file and write data into it using the methods
//OutputStream class.
import java.util.Scanner;
import java.io.IOException;
import java.io.FileOutputStream;
class p26_1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the name of the file");
        String file = ob.nextLine();
        System.out.println("enter the contents of file");
        String d = ob.nextLine();
        try
        {
              FileOutputStream f = new FileOutputStream(file);
              byte[] b = d.getBytes();
              f.write(b); 
              System.out.println("Data written Succesfully");  
        }
        catch (IOException e)
        {
            System.out.println("An error occures");    
        }
    }
}
