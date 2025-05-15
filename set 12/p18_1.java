//Create an interface having prototypes of functions area() and perimeter(). Create
//two classes Circle and Rectangle which implements the above interface. Create
//a menu driven program to find area and perimeter of objects.
import java.util.Scanner;
interface prototype
{
    void area();
    void perimeter();
}

class circle implements prototype
{
    int r;
    circle(int r)
    {
        this.r=r;    
    }
    public void area()
    {
        double a =3.14*r*r;
        System.out.println("area of circle="+a);    
    }
    public void perimeter()
    {
        double p =2*3.14*r;
        System.out.println("area of circle="+p);    
    }
}

class rectangle implements prototype
{
    int b,h;
    rectangle(int b,int h)
    {
        this.b=b;    
        this.h=h;
    }
    public void area()
    {
        double a =h*b;
        System.out.println("area of rectangle="+a);    
    }
    public void perimeter()
    {
        double p =2*(h+b);
        System.out.println("area of rectangle="+p);    
    }
}

class p18_1
{
    public static void main(String args[])
    {
        prototype pp;
        int op=0;
        Scanner ob = new Scanner(System.in);
        while(op!=3)
        {   
            System.out.println("1.circle");
            System.out.println("2.rectangle");
            System.out.println("3.exit");
            op=ob.nextInt();
            switch(op)
            {
                case 1:System.out.println("enter radiues");
                int r = ob.nextInt();
                pp = new circle(r);
                pp.area();
                pp.perimeter();
                break;
                case 2:System.out.println("enter b");
                int b = ob.nextInt();
                System.out.println("enter h");
                int h = ob.nextInt();
                pp = new rectangle(b,h);
                pp.area();
                pp.perimeter();
                break;
                case 3:op=3;
                break;
                default:System.out.println("invalid argument");  
                break;  
            }
            
            
        }
    }
}
