//Create a class “Person” with fields “name” and “age” and a method “display1()”
//that prints the name and age of the person.
//Create a subclass “Employee” that extends “Person” and adds a field “salary”
//and a method “display2()” that prints the name, age, and salary of the employee.
//Create an object of the “Person” class and call the “display1()” method.
//Create an object of the `Employee` class and call the “display1()” and
//“display2()” methods.
class person
{
    String name;
    int age;
    person(String name,int age)
    {
        this.name=name;
        this.age=age;
    }
    void display1()
    {
        System.out.println("name="+name);
        System.out.println("age="+age);      
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
    void display2()
    {
        System.out.println("name="+name);
        System.out.println("age="+age);
        System.out.println("salary="+salary);       
    }
}

class p13_1
{   public static void main(String args[])
    {
    person p1 = new person("ali",44);
    p1.display1();
    employee e1 = new employee("nazee",22,100000);
    e1.display1();
    e1.display2();
}
}
