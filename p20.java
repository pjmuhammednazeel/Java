//Print the 3-digit Armstrong numbers between two intervals.
import java.util.Scanner;
class p20
{
    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the first interval");
        int a = ob.nextInt();
        System.out.println("Enter the second interval");
        int b = ob.nextInt();
        for(int i=a;i<=b;i++)
        {   
            int arm=0,rem;
            int orgnum=i;
            int j=i;
            while(j!=0)
            {
                rem=j%10;
                arm=arm+(rem*rem*rem);
                j=j/10;            
            }   
            if(orgnum==arm)
            {
                System.out.println(""+orgnum);            
            }     
        }
            
    }
}
