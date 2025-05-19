//Write a java program for implementing multiple exceptions like
//ArithmaticException and ArrayIndexOutofBoundsException
class p20_2
{
    public static void main(String args[])
    {
        int a = 10;
        int b = 2; 
        int [] numbers = {1,2,3,4};
        try
        {
            int c = a/b;
            System.out.println("PRint="+numbers[5]);    
        } 
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception");
        }
        catch(ArrayIndexOutOfBoundsException e)        
        {
            System.out.println("Array out of bounds");
        }
    }
}
