//Create a class with Vehicle with serial no, type and name as instance variables
//and display the details. Create a subclass of Vehicle as Car with serial no, name
//and cost as instance variables and display the details. Implement runtime
//polymorphism (method overriding with dynamic method dispatch)
class Vehicle {
    int serialno;
    String type, name;

    Vehicle(int serialno, String type, String name) {
        this.serialno = serialno;
        this.type = type;
        this.name = name;
    }

    public void display() {
        System.out.println("Serial No: " + serialno);
        System.out.println("Type     : " + type);
        System.out.println("Name     : " + name);
    }
}

class Car extends Vehicle {
    int cost;

    Car(int serialno, String name, int cost) {
        super(serialno, "Car", name);  // "Car" is passed as the type
        this.cost = cost;
    }

    @Override
    public void display() {
        System.out.println("Serial No: " + serialno);
        System.out.println("Type     : " + type);
        System.out.println("Name     : " + name);
        System.out.println("Cost     : ₹" + cost);
    }
}

public class p17_1 {
    public static void main(String[] args) {
        Vehicle v;

        // Vehicle object
        v = new Vehicle(101, "Two-Wheeler", "Bike");
        v.display();

        System.out.println("\n--- After assigning Car object to Vehicle reference ---\n");

        // Runtime Polymorphism: Car object assigned to Vehicle reference
        v = new Car(202, "Tesla Model Y", 6000000);
        v.display();  // Calls Car's overridden display()
    }
}

