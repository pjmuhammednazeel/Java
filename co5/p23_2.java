//Program to find maximum of three numbers using AWT.
import java.awt.*;
import java.awt.event.*;
class max extends Frame implements ActionListener
{   
    TextField t1,t2,t3,t4;
    max()
    {
        setLayout(null);
        setSize(400,400);
        setTitle("Maximum of 3 numbers");

        t1 = new TextField();
        t1.setBounds(120,60,20,20);
        add(t1);
        
        t2 = new TextField();
        t2.setBounds(120,80,20,20);
        add(t2);

        t3 = new TextField();
        t3.setBounds(120,100,20,20);
        add(t3);
        
        t4 = new TextField();
        t4.setBounds(120,120,20,20);
        add(t4);
            

        setVisible(true);
    }
}
class p23_2
{
    public static void main(String args[])
    {
        max ob = new max();    
    }
}
