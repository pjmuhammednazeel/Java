// Sort an array
import java.util.Scanner;
class p27
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = ob.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextInt();
        }    
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i]<a[j])
                {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp; 
                
                }            
            }        
        }
        System.out.println("Sorted array"); 
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]); 
        }  
    }
}
