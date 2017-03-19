import java.awt.*;
import java.awt.event.*;
	public class Calculator extends Frame implements ActionListener{
	Panel p1=new Panel();
	Panel p2=new Panel();
	Panel p3=new Panel();
	TextField txt=new TextField(13);
	
	Button bt1,bt2,bt3,bt4,bt5,bt6,bt7;
	Button[] bt=new Button[10];
	
	double num1=0,num2=0,num=0,n;
	int i=0;
	public Calculator(String ss){
		super(ss);
		setSize(100, 300);
		setBackground(new Color(85,207,253));
		setVisible(true);
		//设置运算符按钮
		bt1=new Button("C");
		bt2=new Button(".");
		bt3=new Button("=");
		bt4=new Button("/");
		bt5=new Button("x");
		bt6=new Button("-");
		bt7=new Button("+");
		bt1.addActionListener(this);
		bt2.addActionListener(this);bt3.addActionListener(this);
		bt4.addActionListener(this);bt5.addActionListener(this);
		bt6.addActionListener(this);bt7.addActionListener(this);
		
		bt1.setForeground(Color.red);
		setLayout(new FlowLayout()); //设置布局管理器
		p1.setLayout(new FlowLayout());
		p2.setLayout(new GridLayout(4,3,7,7));
		p3.setLayout(new GridLayout(4,1,7,7));
	    p1.add(txt); //增加组件到面板
		p1.add(bt1);
		for(int i=9;i>=0;i--){//添加10个基本数字
			bt[i]=new Button(Integer.toString(i));
			p2.add(bt[i]);
			bt[i].addActionListener(this);
		}
		//添加“.”及“=”
		p2.add(bt2);
		p2.add(bt3);
		
		p3.add(bt4);
		p3.add(bt5);
		p3.add(bt6);
		p3.add(bt7);
		
		add(p1); //增加组件到Applet
		add(p2);
		add(p3);	
		
		
	}
	
	public Dimension getPreferredSize(){
		return new Dimension(210,220);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object b=e.getSource();			
		for(int i=0;i<=9;i++){
			if(b==bt[i]){	
				txt.setText(txt.getText()+Integer.toString(i));
			}
		}
		if(b==bt2)	txt.setText(txt.getText()+".");
		if(b==bt1)	txt.setText(null);
		 if(b==bt4) {	//除法
			 i=0;
			 num1=Double.parseDouble(txt.getText());	txt.setText("");
		 }
		 if(b==bt5) {//乘法
			 i=1;
			 num1=Double.parseDouble(txt.getText());	txt.setText("");
		 }
		 if(b==bt6) {	//减法
			 i=2;
			 num1=Double.parseDouble(txt.getText());	txt.setText("");
		 }
		 if(b==bt7) {//加法
			 i=3;
			num1=Double.parseDouble(txt.getText());		txt.setText("");				
			}
		 if(b==bt3) {
			 num2=Double.parseDouble(txt.getText());
			 switch(i){
			 case 0:if(num2==0){txt.setText("ERROR");}//除数不能为0
			 		else num=num1/num2;txt.setText(Double.toString(num));break;
			 case 1:num=num1*num2;txt.setText(Double.toString(num));break;
			 case 2:num=num1-num2;txt.setText(Double.toString(num));break;
			 case 3:num=num1+num2;txt.setText(Double.toString(num));break;
			 }				
			}
	}
		
	public static void main(String[] args) {
		Calculator frm=new Calculator("Calculator");
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);}});
		frm.pack();	
		frm.show();
	}	
}
