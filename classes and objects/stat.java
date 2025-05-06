class cpu
{   
    int price;
    cpu(int price)
    {
        this.price=price;    
    }
    class processor
    {
        int no;
        String manufacturer;
        processor(int no,String manufacturer)
        {
            this.no=no;
            this.manufacturer=manufacturer;    
        }
        void display()
        {
            System.out.println("Price="+price);
            System.out.println("No of cores="+no);
            System.out.println("Manufacturer="+manufacturer);    
        }
        static class ram
        {
            int memmory;
            String manufacturer;
            ram(int memmory,String manufacturer)
            {
                this.memmory=memmory;
                this.manufacturer=manufacturer;    
            }
            void display()
            {
                System.out.println("memmory="+memmory);
                System.out.println("manufacturer="+manufacturer);    
            }   
        }    
    }
}
class stat
{
    public static void main(String args[])
    {
       cpu c = new cpu(1000);
       cpu.processor p = c.new processor(3,"corsair");
       p.display();
       cpu.processor.ram r = new cpu.processor.ram(4,"apache");
       r.display();
           
    }
}
