//Define a class ‘product’ with data members pcode, pname and price. Create 3
//objects of the class and find the product having the lowest price. 
import java.util.Scanner;
class product
{
	int pcode,price;
	String pname;
	
	product(int pcode,int price,String pname)
	{
		this.pcode = pcode;
		this.price = price;
		this.pname = pname;
	}
	void display()
	{
		System.out.println("Product name="+pname);
		System.out.println("Product code="+pcode);
		System.out.println("Product price="+price);
	}
	
}

class p1
{
	public static void main(String args[])
	{
		Scanner ob = new Scanner(System.in);
		product p[] = new product[3];
		for(int i = 0;i < 3;i++)
		{
			System.out.println("Enter productname");
			String pname = ob.nextLine();
			
			System.out.println("Enter productcode");
			int pcode = ob.nextInt();
			System.out.println("Enter price");
			int price = ob.nextInt();
			ob.nextLine();
			p[i] = new product(pcode,price,pname);
			
		}
		int count=0;
		int lowest = p[0].price;
		if(p[1].price<lowest)
		{
			lowest = p[1].price;
			count = 1;
		}
		if(p[2].price<lowest)
		{
			lowest = p[2].price;
			count = 2;
		}
		p[count].display();
	}
}
