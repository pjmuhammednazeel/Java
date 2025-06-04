package graphics;
import java.util.Scanner;

public class rectangle
{  
    
    public void display()
    {   
        int l,b;
        Scanner ob = new Scanner(System.in);
        System.out.println(" enter l");
        l = ob.nextInt();
        System.out.println(" enter l");
        b = ob.nextInt();
        double ar = l*b;
        System.out.println("Area of rectangle="+ar);    
    }
}
