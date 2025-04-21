//Define a class employee with instance variables Empid, Empname, Basic
//Salary, HRA, DA, Gross-Salary.
//Initialize the instance variables and
//calculate
//the gross-salary of 5 employees. Also display Empid,
//Empname and Gross-Salary of 5 employees.
//Hint:- Use the concept of object array. DA=50% of Basic salary and
//HRA=5% of Basic Salary. Input the Empid, Empname and Basic Salary of 5
//employees using Scanner class.
import java.util.Scanner;
class employee
{
    int empid,salary,gross;
    String empname;
    employee(int i,int s,String emp)
    {
        empid=i;
        salary=s;
        empname=emp;    
    }
    void calculate()
    {
          gross=salary*100;  
    }
    void display()
    {
         System.out.println("Id="+empid);
         System.out.println("gross salary="+gross);
        System.out.println("name="+empname);   
    }

}
class p1
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        
        System.out.println("Enter the no of employees");
        int n = ob.nextInt();
        
        int id,salary;
        String name;
        employee emp[] = new employee[n];
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter the Id of employee");  
            id = ob.nextInt();
            ob.nextLine(); 
            System.out.println("Enter the Name of employee");  
            name = ob.nextLine(); 
            System.out.println("Enter the Basic salary of employee");  
            salary = ob.nextInt();
            emp[i] = new employee(id,salary,name);
            emp[i].calculate();      
        }
        for(int i=0;i<n;i++)
        {
             emp[i].display();       
        }    
    }
}
