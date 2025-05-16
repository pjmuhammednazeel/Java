import java.util.Scanner;
class p20_1
{
    public static void main(String args[])
    {
        try
        {
            Scanner ob = new Scanner(System.in);
            System.out.println("Enter 1st no"); 
            int a = ob.nextInt();
            System.out.println("Enter 2nd no"); 
            int b = ob.nextInt();    
            int c = a+b;
            int d = a-b;
            int e = a*b;
            int f = a/b;
            System.out.println("a+b="+c); 
            System.out.println("a-b="+d); 
            System.out.println("a*b="+e); 
            System.out.println("a/b="+f); 
        
        }    
        catch(ArithmeticException e)
        {
              System.out.println("cant divide by zero");   
        }
        catch(Exception e)
        {
              System.out.println("invalid");   
        }
    }
}
