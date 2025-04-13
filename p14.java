//Program to print day of week name using switch...case
import java.util.Scanner;
class p14
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("1.Monday");
        System.out.println("2.Tuesday");   
        System.out.println("3.Wednesday");   
        System.out.println("4.Thursday");   
        System.out.println("5.Friday");   
        System.out.println("6.Saturday");   
        System.out.println("7.Sunday");      
        int op = ob.nextInt();
        switch(op)
        {
            case 1:System.out.println("1.Monday");
            break;        
            case 2:System.out.println("2.Tuesday");
            break;  
            case 3:System.out.println("3.Wednesday");
            break;  
            case 4:System.out.println("4.Thursday");
            break;  
            case 5:System.out.println("5.Friday");
            break;  
            case 6:System.out.println("6.Saturday");
            break;  
            case 7:System.out.println("7.Sunday");
            break;  
            default:System.out.println("Invalid");
            break;
        }


    }
}
