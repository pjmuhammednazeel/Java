//ii. sorting a given list of names in ascending order
import java.util.Scanner;
import java.util.Arrays;
class p24
{
    public static void main(String[] args)
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the limit");
        int n = ob.nextInt();
        ob.nextLine();
        String a[] = new String[n];
        for(int i=0;i<n;i++)
        {
            a[i] = ob.nextLine();            
        }   
        Arrays.sort(a); 
        for(int i=0;i<n;i++)
        {
            System.out.println(" "+a[i]);           
        } 
    }
}
