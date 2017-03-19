import java.awt.event.*;
import java.awt.*;
public class Control extends Frame{
	TextField txt1;//半径数值显示
	Scrollbar s1;//滚动条
	int r=50;
	Choice c1;//选择项
	int c,d;
	Button bt1=new Button("delete");
	public Control(String ss){
		super(ss);
		Label l1=new Label("radius:");
		s1=new Scrollbar(Scrollbar.HORIZONTAL);
		txt1=new TextField(3);
		setLayout(new FlowLayout());
		s1.addAdjustmentListener(new AdjustmentListener(){
			public void adjustmentValueChanged(AdjustmentEvent e){
				processAction(e);
			}
		});
		Label l2=new Label("color:");
		c1=new Choice();c1.add("black");c1.add("red"); c1.add("blue");	
		c1.addItemListener(new ItemListener(){
		  	public void itemStateChanged(ItemEvent e){
		  		processAction1(e);}
		});
		Label l3=new Label("mode:");
		CheckboxGroup group1=new CheckboxGroup();
		Checkbox ch1=new Checkbox("fill",group1,true);
		Checkbox ch2=new Checkbox("draw",group1,true);
		ch1.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				processAction2(e);
			}
		});
		ch2.addItemListener(new ItemListener(){
			public void itemStateChanged(ItemEvent e){
				processAction2(e);
			}
		});
		
		bt1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
					processAction3(e);}});
		addNotify();add(l1);add(s1);add(txt1);add(l2);add(c1);add(l3);add(ch1);add(ch2);add(bt1);
	}
	public void processAction(AdjustmentEvent e){
		int value=e.getValue();
		if(e.getAdjustable()==s1){
			if(e.getAdjustmentType()==AdjustmentEvent.UNIT_DECREMENT) {r-=10;txt1.setText(r+"");}
			if(e.getAdjustmentType()==AdjustmentEvent.UNIT_INCREMENT) {r+=10;txt1.setText(r+"");}		
			}
		repaint();
	}
	public void processAction1(ItemEvent e){
		String name=(String)e.getItem();
		if(e.getItemSelectable()==c1){
			if(name=="black"){
				c=1;}
			if(name=="red"){
				c=2;}
			if(name=="blue"){
				c=3;}}
		repaint();
	}
	public void processAction2(ItemEvent e){
		String name=(String)e.getItem();
		if(name=="fill"){
			if(e.getStateChange()==e.SELECTED){d=1;}
			if(e.getStateChange()==e.DESELECTED){d=0;}
		}
		if(name=="draw"){
			if(e.getStateChange()==e.SELECTED){d=0;}
			if(e.getStateChange()==e.DESELECTED){d=1;}
		}
		repaint();
	}
	protected void processAction3(ActionEvent e){
		Button b=(Button)e.getSource();		
		if(b.equals(bt1)) {d=2;r=50;}
		repaint();			
			}
	public Dimension getPreferredSize(){
	  	return new Dimension(300,300);
	  }
	public void paint(Graphics g){
		if(c==1) g.setColor(Color.black);
		if(c==2) g.setColor(Color.red);
		if(c==3) g.setColor(Color.blue);
		if(d==0) g.drawOval(120,120,r,r);
		if(d==1) g.fillOval(120,120,r,r);		
		if(d==2) g.fillOval(120,120,r,r);
	}
public static void main(String[] args){
	Control nowFrame=new Control("CircleGUI");
	nowFrame.addWindowListener(new WindowAdapter(){
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
	});
	nowFrame.pack();
	nowFrame.show();
}		
}
