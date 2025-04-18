//Reverse the content of this string and convert the resultant string in
//upper case
//Read another string and append it to the resultant string of above
import java.util.Scanner;
class p25
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = ob.nextLine();
        StringBuffer a = new StringBuffer(s);
        a.reverse();
        String upper = a.toString();
        upper=upper.toUpperCase();
        System.out.println(upper);
        System.out.println("Enter the String");
        String c = ob.nextLine();
        upper=upper.concat(c);
        System.out.println(upper);
        
        
            
    }
}
