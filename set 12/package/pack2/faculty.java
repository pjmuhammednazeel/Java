package pack2;
import java.util.Scanner;
public class faculty
{   
    int sal;
    public void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("ENter sal");
        sal = ob.nextInt();   
    }
    public void display()
    {
         System.out.println("sal"+sal);   
    }
}

