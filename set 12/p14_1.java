//Write a Java program to create a class Employee with a method called
//calculateSalary(). Create two subclasses Manager and Programmer. In
//each subclass, override the calculateSalary() method to calculate and
//return the salary based on their specific roles.
class employee
{
    void calculatesalary()
    {
        System.out.println("");  
    }
}
class manager extends employee
{   
    int msalary;
    manager(int msalary)
    {
        this.msalary=msalary;    
    }
    void calculatesalary()
    {
        System.out.println("Salary of manager"+msalary);    
    }
}
class programmer extends employee
{   
    int psalary,bonus;
    programmer(int psalary,int bonus)
    {
        this.psalary=psalary;
        this.bonus=bonus;
    }   
    void calculatesalary()
    {   
        int t = psalary+bonus;
        
        System.out.println("Salary of programmer="+t);    
    }
}
class p14_1
{
    public static void main(String args[])
    {
        programmer p = new programmer(40000,10000);
        manager m = new manager(100000);
        m.calculatesalary();
        p.calculatesalary();    
    }
}
