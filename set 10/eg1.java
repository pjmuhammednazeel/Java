import java.util.Scanner;
class A
{
    int n;
    A(int n)
    {
        this.n = n;    
    }
    
    class B
    {
        int f;
        B(int f)
        {
            this.f = f;    
        }    
        void display()
        {
            System.out.println("n="+n);  
            System.out.println("f="+f);   
        }
    }
}
class eg1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);    
        System.out.println("Enter n");
        int n = ob.nextInt();
        System.out.println("Enter f");
        int f = ob.nextInt();
        A outer = new A(n);
        A.B inner = outer.new B(f);
        inner.display();
    }
}
