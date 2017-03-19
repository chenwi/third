package test;

import java.awt.*;
import java.awt.event.*;
public class s42 extends Frame implements KeyListener{
	public Label l1=new Label(" ");
	int xpos=150,ypos=150;
	public s42(){
		super("key event");	//setLayout(new FlowLayout());	
		addKeyListener(this);	//add(l1);
		this.setSize(400,400);this.setVisible(true);}
	public static void main(String[] args){
		s42 nowframe=new s42();
		nowframe.setResizable(false);
		nowframe.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);}});}
	public void paint(Graphics g){
		g.setColor(Color.blue);g.fillRect(xpos,ypos,100,100);}
		public void keyPressed(KeyEvent e){
			int nKeycode=e.getKeyCode();
			if(nKeycode==KeyEvent.VK_LEFT)  xpos=xpos-10;
			if(nKeycode==KeyEvent.VK_RIGHT) xpos=xpos+10;
			if(nKeycode==KeyEvent.VK_UP)  ypos=ypos-10;
			if(nKeycode==KeyEvent.VK_DOWN)  ypos=ypos+10;
			  repaint();}
		public void keyReleased(KeyEvent e){}
		public void keyTyped(KeyEvent e){}
	}
