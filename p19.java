//Write a java program to reverse a given string
import java.util.Scanner;
class p19
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the String");
        String a = ob.nextLine();
        StringBuffer sb = new StringBuffer(a);
        StringBuffer reversed = sb.reverse();
        System.out.println("Reversed String="+reversed);
            
    }
}
