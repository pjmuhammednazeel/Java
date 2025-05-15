//Hint:- The base class ‘stud_details’ is created for assigning the Rol.no and
//name of the student and display it. The derived class “Marks” is created
//for inputting 3 subjects marks and display it. Again, a derived class is
//created as “Total” for calculate the total mark of 3 subjects and display it.
//Inputs are given through the keybord
import java.util.Scanner;
class stud_details
{
    int rollno;
    String name;
    void input()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the rollno");
        rollno = ob.nextInt();
        ob.nextLine();
        System.out.println("Enter the name"); 
        name = ob.nextLine();    
    }
    void display()
    {
        System.out.println("rollno="+rollno);
        System.out.println("name="+name);
    }
}
class marks extends stud_details
{
    int m1,m2,m3;
    void input1()
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter mark1");
        m1 = ob.nextInt();
        System.out.println("Enter mark2"); 
        m2 = ob.nextInt(); 
        System.out.println("Enter mark3"); 
        m3 = ob.nextInt();   
    }
    void display1()
    {
        System.out.println("m1="+m1);
        System.out.println("m2="+m2);
        System.out.println("m3="+m3);
    }
}
class total extends marks
{
    int total;
    void cal()
    {
        total=m1+m2+m3;
    }
    void display2()
    {
        System.out.println("Total="+total);
    }
}
class p13_3
{
    public static void main(String args[])
    {
        total t = new total();
        t.input();
        t.input1();
        t.cal();
        t.display();
        t.display1();
        t.display2();

    }
}
