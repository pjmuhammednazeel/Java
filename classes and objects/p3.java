//Implement parameterized constructor using student class
class student
{
    String name;
    int id;
    student(String n,int i)
    {
        name=n;
        id=i;    
    }
    void display()
    {
        System.out.println("name="+name);
        System.out.println("id="+id);    
    }
}
class p3
{
    public static void main(String args[])
    {
         student stud = new student("nazeel",1);
         stud.display();   
    }
}
