//Create a Graphics package that has classes for shapes Rectangle, Triangle,
//Square and Circle. Test the package by finding the area of these figures.
//Hint:- Create 3 java files for calculate the area 3 different shapes in the
//directory Shapes inside the directory where the java program is
//stored. Then import all the class files inside the package Shapes to
//our original program.
//Equation for area of a circle= A=πr^2 .
//Area of a triangle = √(s(s-a)(S-b)(S-c))
//Area of a rectangle= l*b
import graphics.circle;
import graphics.triangle;
import graphics.rectangle;
class p21_1
{
    public static void main(String args[])
    {
        circle c = new circle();
        c.display();
        triangle t = new triangle();
        t.display();
        rectangle r = new rectangle();
        r.display();    
    }    
}
