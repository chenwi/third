import java.applet.*;
import java.awt.Color;
import java.awt.Graphics;

public class Mydraw extends Applet{
	public void paint(Graphics g){

		int polyx[]={40,160,100};
		int polyy[]={128,130,170};
		int l=polyx.length;
		g.setColor(Color.blue);
		g.drawPolygon(polyx,polyy,l);
		g.fillRect(120, 55, 40, 40);
		g.setColor(Color.red);
		g.fillOval(50, 50, 50, 50);
		
	}
}
