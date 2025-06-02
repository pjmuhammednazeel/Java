//Create the Applet with the following shapes.i)coneii)cylinderiii)square inside the ovaliv)circle inside rounded square
import java.awt.*;
class shapes extends Frame
{
    shapes()
    {
        setTitle("shapes");
        setSize(400,400);
        setVisible(true);    
    }
    public void paint(Graphics g)
    {
        g.drawOval(120,120,60,20);
        g.drawLine(120,130,150,70);
        g.drawLine(180,130,150,70);
        g.drawOval(220,220,20,60);
        g.drawOval(150,220,20,60);
        g.drawLine(160,220,230,220);
        g.drawLine(160,280,230,280);
        g.drawOval(300,300,60,50);
        g.drawRect(314,307,35,35);
        g.drawRoundRect(250,120,50,50,40,40);
        g.drawOval()
    }
}
class p23_1
{
    public static void main(String args[])
    {
        shapes ob = new shapes();    
    }
}
