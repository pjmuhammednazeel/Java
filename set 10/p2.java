//Create CPU with attribute price. Create inner class Processor with attributes
//no. of cores, manufacturer and static nested class RAM with attributes
//memory and manufacturer. Create an object of CPU class and print
//information of Processor and RAM.
class CPU {
    double price;
    
 
    class Processor {
        int cores;
        String manufacturer;
        
        Processor(int cores, String manufacturer) {
            this.cores = cores;
            this.manufacturer = manufacturer;
        }
        
        void display() {
            System.out.println("Processor Details:");
            System.out.println("Cores: " + cores);
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
    
    // Static nested class RAM
    static class RAM {
        int memory;
        String manufacturer;
        
        RAM(int memory, String manufacturer) {
            this.memory = memory;
            this.manufacturer = manufacturer;
        }
        
        void display() {
            System.out.println("\nRAM Details:");
            System.out.println("Memory: " + memory + "GB");
            System.out.println("Manufacturer: " + manufacturer);
        }
    }
    
    CPU(double price) {
        this.price = price;
    }
    
    void display() {
        System.out.println("CPU Price: $" + price);
    }
}

public class p2 {
    public static void main(String[] args) {
        
        CPU cpu = new CPU(299.99);
        
        
        CPU.Processor processor = cpu.new Processor(8, "Intel");
        
        
        CPU.RAM ram = new CPU.RAM(16, "Corsair");
        
     
        cpu.display();
        processor.display();
        ram.display();
    }
}
