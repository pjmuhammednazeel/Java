//Print the prime numbers up to the limit n
import java.util.Scanner;
class p16
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("enter the limit");
        int n = ob.nextInt();
        for(int i=2;i<=n;i++)
        {   int flag=0;
            for(int j=1;j<=i;j++)
            {
                if(i%j==0)
                {
                    flag=flag+1;                
                }           
            }     
            if(flag<3)
            {
                System.out.println(""+i);            
            }   
        }   
    }
}
