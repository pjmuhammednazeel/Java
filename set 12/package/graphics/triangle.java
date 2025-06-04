package graphics;
import java.util.Scanner;
public class triangle
{  
    
    public void display()
    {   
        int a,b,c,s;
        Scanner ob = new Scanner(System.in);
        System.out.println("side a");
        a = ob.nextInt();
        System.out.println("side b");
        b = ob.nextInt();
        System.out.println("side c");
        c = ob.nextInt();
        System.out.println("enter s");
        s = ob.nextInt();
        double at = Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area of rectangle="+at);    
    }
}
