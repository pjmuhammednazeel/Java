//Create a package Pack2 with 2 classes Student and Faculty. Student class is
//used to accept students' details and display it. Faculty class is used to accept
//faculty details and display it. Import these two classes into our program and
//perform all operations
import pack2.student;
import pack2.faculty;
class p19_2
{
    public static void main(String args[])
    {
        student s = new student();
        s.input();
        s.display();
        faculty f = new faculty();
        f.input();
        f.display();    
    }
}
