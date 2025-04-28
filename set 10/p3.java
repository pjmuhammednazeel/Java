//Program to create a class for Employee having attributes eNo, eName, eSalary.
//Read ‘n’ employee information and Search for an employee given eNo, using
//the concept of array of Objects.
import java.util.Scanner;
class employee
{
	int eno;
	String ename;
	float esalary;
	employee(int eno,String ename,float esalary)
	{
		this.eno=eno;
		this.ename=ename;
		this.esalary=esalary;
	}
	void display()
	{
		System.out.println("eno="+eno);
		System.out.println("ename="+ename);
		System.out.println("esalary="+esalary);
	}
}
class p3
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		
		System.out.println("Enter The limit");
		int n = ob.nextInt();
		ob.nextLine();
		employee emp[] = new employee[n];
		for(int i=0;i<n;i++)
		{
			System.out.println("Enter the name");
			String ename = ob.nextLine();
			System.out.println("Enter the eno");
			int eno = ob.nextInt();
			System.out.println("Enter the salary");
			float esalary = ob.nextFloat();
			ob.nextLine();
			emp[i] = new employee(eno,ename,esalary);
		}
		System.out.println("Enter the employee number");
		int no = ob.nextInt();
		for(int i=0;i<n;i++)
		{
			if(emp[i].eno==no)
			{
				emp[i].display();
			}
		}
		
	}
}
