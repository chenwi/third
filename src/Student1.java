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
    
	// 将Calendar对象转换为Date对象
	Date date = c.getTime();
    
	// 创建SimpleDateFormat对象，指定目标格式
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    
	// 将日期转换为指定格式的字符串
	String now = sdf.format(date);
	System.out.println("当前时间：" + now);
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