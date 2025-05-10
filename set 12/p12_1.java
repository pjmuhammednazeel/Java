//Perform method overloading.
//Hint:- Defining 3 methods having same name. One method accepts two integer
//parameters to add them. Second method accepts 3 double values and adds them.
//The third method accepts one integer argument and one double argument and
//adds them. 
class over
{
    void add(int a,int b)
    {
        System.out.println("a+b="+a+b);    
    } 
    void add(double c,double d,double e)
    {
        System.out.println("c+d+e="+(c+d+e));    
    }
    void add(int f,double g)
    {
        System.out.println("f+g="+f+g);    
    }
}
class p12_1
{
    public static void main(String args[])
    {
        over ov = new over();
        ov.add(1,2);
        ov.add(1,2,3);
        ov.add(1,2);    
    }
}
