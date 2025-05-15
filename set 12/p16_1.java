//Compute the area of a rectangle, triangle and a circle using interface.
interface compute
{
    void area();
}

class rectangle implements compute
{
    int l,b;
    rectangle(int l,int b)
    {
        this.l=l;    
        this.b=b;    
    }
    public void area()
    {
        int a=l*b;
        System.out.println("Area of rectangle="+a);    
    }
}

class triangle implements compute
{
    int b,h;
    triangle(int b,int h)
    {
        this.h=h;    
        this.b=b;    
    }
    public void area()
    {
        double a=0.5*b*h;
        System.out.println("Area of triangle="+a);    
    }
}

class circle implements compute
{
    int r;
    circle(int r)
    {
        this.r=r;      
    }
    public void area()
    {
        double a=3.14*r*r;
        System.out.println("Area of circle="+a);    
    }
}
class p16_1
{
    public static void main(String args[])
    {   
        
        compute c;
        c = new rectangle(2,2);
        c.area();
        c = new triangle(2,2);
        c.area();
        c = new circle(2);
        c.area();
    }
}
