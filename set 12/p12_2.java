//Perform constructor overloading.
class over
{
    over()
    {
        System.out.println("argument1");    
    }
    over(int a)
    {
        System.out.println("argument2= "+a);    
    }
}
class p12_2
{
    public static void main(String args[])
    {
        over ov = new over();
        over ov1 = new over(2);  
    }
}
