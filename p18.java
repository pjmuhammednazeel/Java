//Read 2 matrices and perform matrix addition and multiplication
import java.util.Scanner;
class p18
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int a[][];
        int b[][];
        int sum[][];
        int mul[][];
        a = new int[10][10];
        b = new int[10][10];
        sum = new int[10][10];
        mul = new int[10][10];
        int i,j;
        System.out.println("Enter the number of rows");
        int r = ob.nextInt();
        System.out.println("Enter the number of coloumns");
        int c = ob.nextInt();
        System.out.println("Enter the elements of of 1st matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();            
            }        
        }   
        System.out.println("Enter the elements of of 2nd matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                b[i][j]=ob.nextInt();            
            }        
        } 
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];           
            }        
        }
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                mul[i][j]=a[i][j]*b[i][j];           
            }        
        }
        System.out.println("Sum of two matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                 System.out.print(" "+sum[i][j]);           
            }        
            System.out.println(" ");
        }
        System.out.println("Multiplication  of two matrix");
        for(i=0;i<r;i++)
        {
            for(j=0;j<c;j++)
            {
                 System.out.print(" "+mul[i][j]);           
            }        
            System.out.println(" ");
        }
                
        
         
    }
}
