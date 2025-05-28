import java.awt.*;
 class circle extends Frame
{
	 circle()
	{
		setSize(400,400);
		setVisible(true);
	}
    public void paint(Graphics g)
    {
        g.setColor(Color.BLUE);       
        g.drawOval(120,100,100,100);
        g.setColor(Color.BLACK); 
        g.drawOval(130,110,80,80);
        g.setColor(Color.YELLOW); 
        g.drawOval(145,125,50,50);
          
        	  
    }
}

public class p22_2
{
	public static void main(String args[])
	{
        	
        circle ob = new circle();
	}
}
