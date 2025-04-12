//Write a Java program to display default value of all primitive data types of
class p2 {
    int a;
    char b;
    double c;
    float d;

    public static void main(String[] args) {
        p2 obj = new p2();

        System.out.println("int = " + obj.a);
        System.out.println("char = '" + obj.b + "'");
        System.out.println("double = " + obj.c);
        System.out.println("float = " + obj.d);
    }
}

