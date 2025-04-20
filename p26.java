//sorting strings
import java.util.Scanner;
class p26
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the length of string array");
        int n = ob.nextInt();
        ob.nextLine();
        System.out.println("Enter the Strings");
        String a[] = new String[n];
        for(int i=0;i<n;i++)
        {
            a[i]=ob.nextLine();
        }
        String temp;
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(a[i].compareTo(a[j])>0)
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;                
                }            
            }
        }
        System.out.println("The sorted strings");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }    
    }
}
