import java.awt.*;
import java.awt.event.*;

public class MyMenu extends Frame{
	MenuBar mbar=new MenuBar();
	Menu menu1,menu2,menu3;
	Menu menu11,menu22,menu33,menu44;
	MenuItem[] mt=new MenuItem[15];
	public MyMenu(String ss){
		super(ss);
		menu1=new Menu("�ļ�");menu2=new Menu("���");menu3=new Menu("��ͼ");//һ���˵�
		menu11=new Menu("����");menu22=new Menu("����");menu33=new Menu("ѡ��");//�����˵�
		//һ���˵��в˵���
		mt[0]=new MenuItem("��");mt[1]=new MenuItem("�½�");mt[2]=new MenuItem("���Ϊ");
		mt[3]=new MenuItem("����");mt[4]=new MenuItem("ճ��");mt[5]=new MenuItem("ɾ��");
		mt[6]=new MenuItem("��С");mt[7]=new MenuItem("�л�");mt[8]=new MenuItem("����");
		//�����˵��в˵���
		mt[9]=new MenuItem("����");mt[10]=new MenuItem("����");mt[11]=new MenuItem("Ӣ��");
		mt[12]=new MenuItem("�ɼ�");mt[13]=new MenuItem("���ɼ�");mt[14]=new MenuItem("����");
		//��Ӷ����˵���
		menu11.add(mt[9]);
		menu22.add(mt[10]);menu22.add(mt[11]);
		menu33.add(mt[12]);menu33.add(mt[13]);menu33.add(mt[14]);
		//���һ���˵���
		for(int i=0;i<3;i++){
			menu1.add(mt[i]);
		}
		menu1.addSeparator();menu1.add(menu11);
		menu2.add(menu22);menu2.addSeparator();
		for(int i=3;i<6;i++){
			menu2.add(mt[i]);
		}
		for(int i=6;i<9;i++){
			menu3.add(mt[i]);
		}
		menu3.addSeparator();menu3.add(menu33);
		//�Ѳ˵���ӵ�MenuBar��
		mbar.add(menu1);mbar.add(menu2);mbar.add(menu3);
		setMenuBar(mbar);
		show();
	}

	public Dimension getPreferredSize(){//���ô��ڴ�С
		return new Dimension(300,300);
	}
	public static void main(String[] args) {
		MyMenu frm=new MyMenu("�˵�����");
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frm.pack();
		frm.show();
	}

}
