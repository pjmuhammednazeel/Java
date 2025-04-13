//Print the multiplication table of a given number
import java.util.Scanner;
class p11
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = ob.nextInt();
        for(int i=1;i<=10;i++)
        {   
            int mul=i*n;
            System.out.println(i+"*"+n+"="+mul);        
        }
    }
}
