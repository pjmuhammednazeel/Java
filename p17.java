//Sort an integer array
import java.util.Scanner;
class p17
{
    public static void main(String args[])
    {
        int a[];
        a = new int[10];
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the length of array");
        int n = ob.nextInt();
        System.out.println("Enter the Elements in the array");
        int temp=0;
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextInt();        
        }
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(a[j]>a[j+1])
                {
                temp=a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                }            
            }        
        }
        for(int j=0;j<n;j++)
        {
            System.out.println(" "+a[j]);        
        }
            
    }
}
