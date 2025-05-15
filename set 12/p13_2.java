//Create a class “Person” with fields “name” and “age” and create a parametrized
//constructor for initialize instance variables.
//Create a subclass “Employee” that extends “Person” and adds a field “salary”.
//Create a parametrized constructor for initialize instance variables and a method
//“display( )” that prints the name, age, and salary of the employee.
//Create an object of the `Employee` class and call the “display()”method to print
//all the details.
class person
{
    String name;
    int age;
    person(String name,int age)
    {
        this.name=name;
        this.age=age;    
    }
}
class employee extends person
{
    int salary;
    employee(String name,int age,int salary)
    {   
        super(name,age);        
        this.salary=salary;
    }
    void display()
    {
        System.out.println("Name="+name);
        System.out.println("Age="+age);
        System.out.println("Salary="+salary);
    }
}
class p13_2
{
    public static void main(String args[])
    {
        employee emp = new employee("nazeel",23,33333);
        emp.display();
    }
}
