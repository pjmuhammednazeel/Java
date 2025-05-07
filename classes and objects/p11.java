//Write a JAVA program which use static variable to count number of objects of
//class created using.
//Hint:- Create a class student with instance rollno and name. Print the students
//count and display the details of each student.
import java.util.Scanner;
class student
{
    int rollno;
    String name;
    static int count=1;
    student(int rollno,String name)
    {
        this.rollno=rollno;
        this.name=name;
    }
    void display()
    {
        System.out.println("rollno="+rollno);
        System.out.println("name"+name);   
        System.out.println("count="+count++); 
    }
}
class p11
{
    public static void main(String args[])
    {   
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = ob.nextInt();
        student stud[] = new student[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter rollno");
            int rollno = ob.nextInt();
            ob.nextLine();
            System.out.println("Enter name");
            String name = ob.nextLine();
            
            stud[i] = new student(rollno,name);
                    
        } 
        for(int i=0;i<n;i++)
        {
            stud[i].display();    
        }  
    }    
}
