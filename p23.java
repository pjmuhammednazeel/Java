//Write a java program to
//i. check whether a given string is palindrome or not.

import java.util.Scanner;
class p23
{   
    public static void main(String args[])
{
    Scanner ob = new Scanner(System.in);
    System.out.println("Enter the String");
    String a = ob.nextLine();
    StringBuffer sb = new StringBuffer(a);
    sb.reverse();
    String reversed = sb.toString();
    if(a.equals(reversed))
    {
    System.out.println("it is palindrome");
    }
    else
    {
     System.out.println("Not Palindrome");    
    }
 }   
}
