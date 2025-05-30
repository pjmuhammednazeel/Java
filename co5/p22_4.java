//Demonstrate action event handling, by using an interface having two text
//boxes and to swap values.
//Hint:- Create two text boxes for entering two numbers and create a
//Button named “Swap”. When we click on the button Swap the values of
//the text boxes should be interchange
import java.awt.*;
import java.awt.event.*;
class swap extends Frame implements ActionListener
{   
    TextField t1,t2;
    Button b;
    swap()
    {   
        setLayout(null);
        setTitle("Swap");
        setSize(400,400);
        t1 = new TextField();
        t1.setBounds(120,120,50,50);
        add(t1);
        t2 = new TextField();
        t2.setBounds(120,150,50,50);
        add(t2);
        b = new Button("Swap");
        b.setBounds(200,200,50,50);
        add(b);
        
        b.addActionListener(this);
        setVisible(true);
        
       
            
    }
     public void actionPerformed(ActionEvent e)
        {
            String temp = t1.getText();
            t1.setText(t2.getText());
            t2.setText(temp);    
        }
    
}
class p22_4
{
    public static void main(String args[])
    {
        swap ob = new swap();   
    }
}
