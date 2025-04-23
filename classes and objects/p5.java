import java.util.Scanner;
class matrix
{
    int r,c;
    int a[][] = new int[10][10];
    int b[][] = new int[10][10];
    int sum[][] = new int[10][10];
    int mul[][] = new int[10][10];   
    matrix(int r,int c)
    {
         this.r = r;
         this.c = c;  
    }
    void read()
    {   
        
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the first matrix elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                a[i][j]=ob.nextInt();    
            }        
        }
        System.out.println("enter the second matrix elements");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                b[i][j]=ob.nextInt();    
            }        
        }
    }
    void add()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                sum[i][j]=a[i][j]+b[i][j];    
            }        
        }
    }
    void mul()
    {
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mul[i][j]=a[i][j]*b[i][j];    
            }        
        }    
    }
    void display()
    {
        System.out.println(" Sum");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.println(" "+sum[i][j]);   
            }        
            System.out.println(" "); 
        }
        System.out.println(" Mul");
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                System.out.print(" "+mul[i][j]);   
            }        
            System.out.println(" "); 
        }
    }
}
class p5
{
    public static void main(String args[])
    {   
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of row");
        int r = ob.nextInt();
        System.out.println("Enter the number of coloumns");
        int c = ob.nextInt();
        matrix m = new matrix(r,c);
        m.read();
        m.add();
        m.mul();
        m.display();
            
    }
}
