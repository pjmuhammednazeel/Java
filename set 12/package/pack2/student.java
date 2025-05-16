package pack2;
import java.util.Scanner;

public class student
{   
    int no;
    public void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("ENter no");
        no = ob.nextInt();   
    }
    public void display()
    {
         System.out.println("no"+no);   
    }
}
