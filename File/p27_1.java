//Program to list the sub directories and files in a given directory and 
//also search for a file name.
import java.io.*;
import java.util.Scanner;
class p26_1.java
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the directory name");
        String name = ob.nextLine();
        File f = new File(name);
        files[] l = f.fileLists();
        for(files : l)
        {
            System.out.println(""+getF)        
        }
    }
}
