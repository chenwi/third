import java.awt.*;
import java.awt.event.*;

public class MyMenu extends Frame{
	MenuBar mbar=new MenuBar();
	Menu menu1,menu2,menu3;
	Menu menu11,menu22,menu33,menu44;
	MenuItem[] mt=new MenuItem[15];
	public MyMenu(String ss){
		super(ss);
		menu1=new Menu("文件");menu2=new Menu("编程");menu3=new Menu("视图");//一级菜单
		menu11=new Menu("设置");menu22=new Menu("语言");menu33=new Menu("选项");//二级菜单
		//一级菜单中菜单项
		mt[0]=new MenuItem("打开");mt[1]=new MenuItem("新建");mt[2]=new MenuItem("另存为");
		mt[3]=new MenuItem("复制");mt[4]=new MenuItem("粘贴");mt[5]=new MenuItem("删除");
		mt[6]=new MenuItem("大小");mt[7]=new MenuItem("切换");mt[8]=new MenuItem("背景");
		//二级菜单中菜单项
		mt[9]=new MenuItem("帮助");mt[10]=new MenuItem("中文");mt[11]=new MenuItem("英文");
		mt[12]=new MenuItem("可见");mt[13]=new MenuItem("不可见");mt[14]=new MenuItem("窗口");
		//添加二级菜单项
		menu11.add(mt[9]);
		menu22.add(mt[10]);menu22.add(mt[11]);
		menu33.add(mt[12]);menu33.add(mt[13]);menu33.add(mt[14]);
		//添加一级菜单项
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
		//把菜单添加到MenuBar中
		mbar.add(menu1);mbar.add(menu2);mbar.add(menu3);
		setMenuBar(mbar);
		show();
	}

	public Dimension getPreferredSize(){//设置窗口大小
		return new Dimension(300,300);
	}
	public static void main(String[] args) {
		MyMenu frm=new MyMenu("菜单例子");
		frm.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		frm.pack();
		frm.show();
	}

}
