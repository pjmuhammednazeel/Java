//Write a program to create a text file “abc.txt” in the current path and check
//whether that file is exists. Using the methods exists(), isDirectory(), isFile(), getName() and getAbsolutePath().
import java.io.File;
import java.io.IOException;
class P25_1
{
    public static void main(String args[])
    {
        
        File f = new File("bbc.txt");
        try
        {
            f.createNewFile();
        }
        catch(IOException e)
        {
              System.out.println("An error occured");  
        }
        System.out.println("file Exist="+f.exists());
        System.out.println("file is a directory="+f.isDirectory());
        System.out.println("file is a File="+f.isFile());
        System.out.println("file Name="+f.getName());
        System.out.println("file Path="+f.getAbsolutePath());          
    }
}
