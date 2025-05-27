//Program to draw Circle, Rectangle, Line in Applet

import java.awt.*;
class shape extends Frame
{
  void shape()
  {
    setTitle("Shapes");
    setSize(400,400);
    setVisible(true);
  }
  public void paint(Graphics g)
  {
    g.drawString("Different Shapes",120,50);
    g.setColor(Color.RED);
    g.drawRect(120,70,100,50);
    g.setColor(Color.BLUE);
    g.drawLine(120,190,180,190);
    g.setColor(Color.YELLOW);
    g.drawOval(120,250,80,80);
  }
}
class p22_1
{
  public static void main(String args[])
  {
    shape ob = new shape();
    ob.shape();
  }
}
