//Draw a comic face using different color.
import java.awt.*;
 class face extends Frame
{
    face()
    {   
        setTitle("Face");
        setSize(400,400);
        setVisible(true);    
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.YELLOW);
        g.fillOval(120,120,100,100);
        g.setColor(Color.BLACK);
        g.fillOval(140,140,10,10);
        g.fillOval(180,140,10,10);
        g.drawArc(140,180,50,25,0,-180);
    
    }
    
}
class p22_3
{
    public static void main(String args[])
    {
        face ob = new face();    
    }
}
