//Implement default constructor using rectangle class
class Rectangle
{
    int length;
    int breadth;
    Rectangle()
    {
        length = 0;
        breadth = 0;    
    }
    void display()
    {
        System.out.println("Length="+length);
        System.out.println("Breadth="+breadth);    
    }
}
class p2
{
    public static void main(String args[])
    {
        Rectangle rect = new Rectangle();
        rect.display();     
    }
}
