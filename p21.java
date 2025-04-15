//Search an element in an array
import java.util.Scanner;
class p21
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[]=new int[10];
        System.out.println("Enter the limit of array");
        int n = ob.nextInt();
        System.out.println("Enter the Elements of array");
        for(int i=1;i<=n;i++)
        {
            a[i]=ob.nextInt();        
        }    
        System.out.println("Enter the element to be searched");
        int s = ob.nextInt();
        for(int i=1;i<=n;i++)
        {
            if(a[i]==s)
            {
                System.out.println("Element found at"+i);            
            }        
        }
    }
}
