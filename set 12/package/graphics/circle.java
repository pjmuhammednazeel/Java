package graphics;
import java.util.Scanner;

public class circle
{  
    
    public void display()
    {   
        int r;
        Scanner ob = new Scanner(System.in);
        System.out.println(" enter radius");
        r = ob.nextInt();
        double a = 3.14*r*r;
        System.out.println("Area of circle="+a);    
    }
}
