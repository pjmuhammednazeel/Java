//Program to demonstrate use of command line arguments to initialize values to
//member variables in a class and to display them.
import java.util.Scanner;
class student
{
    int rlno,engmark,mathsmark,totalmark;
    String stud_name;
    student(int r,int e,int m,String s)
    {
        rlno = r;
        engmark = e;
        mathsmark = m;
        totalmark = e+m;
        stud_name = s;    
    }
    void display()
    {
        System.out.println("name="+stud_name);
        System.out.println("rollno="+rlno);
        System.out.println("totlamark="+totalmark);     
    }
}
class p4
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter name");
        String name = ob.nextLine();
        System.out.println("Enter rollno");
        int rlno = ob.nextInt();
        System.out.println("Enter english mark");
        int engmark = ob.nextInt();
        System.out.println("Enter math mark");
        int mathmark = ob.nextInt();
           
        student stud = new student(rlno,engmark,mathmark,name);
        stud.display();
    }
}
