import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
public class Student1 {
public static void main(String args[]){
	System.out.println("Hello");
	Point p=new Point();
	int x=2,y=3;
	System.out.println(p.point(x,y));
	Calendar c = Calendar.getInstance();
    
	// ��Calendar����ת��ΪDate����
	Date date = c.getTime();
    
	// ����SimpleDateFormat����ָ��Ŀ���ʽ
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
	// ������ת��Ϊָ����ʽ���ַ���
	String now = sdf.format(date);
	System.out.println("��ǰʱ�䣺" + now);
}
}

class Point{
	int x,y;
	public int point(int x,int y){
		this.x=x+3;
		this.y=y;
		return 1;
	}
}