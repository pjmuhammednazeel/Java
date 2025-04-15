//Read a matrix from the console and check whether it is symmetric or not
import java.util.Scanner;
class p22
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[][] = new int[10][10];
        int b[][] = new int[10][10];
        System.out.println("Enter the number of rows");
        int r = ob.nextInt();
        System.out.println("Enter the number of coloumns");
        int c = ob.nextInt();
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                a[i][j] = ob.nextInt();            
            }        
        }    
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                b[j][i] = a[i][j];            
            }        
        } 
        int count=0;
        for(int i=1;i<=r;i++)
        {
            for(int j=1;j<=c;j++)
            {
                if(a[i][j]!=b[i][j])
                {
                    count=count+1;               
                }            
            }        
        } 
        if(count==0)
        {
            System.out.println("The given matrix is symmetric");            
        }
        else
        {
            System.out.println("The given matrix is not symmetric");            
        }
        
    }    
}
