
public class Figure {
	
public void Print(double s,double c){//����Print����
	System.out.println("����ǣ�"+s+";�ܳ��ǣ�"+c);
}
	public static void main(String[] args) {
		Figure fig=new Figure();
		Shape rectangle=new Rectangle();
		Shape circle=new Circle();
		fig.Print(rectangle.Aera(),rectangle.Permiter());
		fig.Print(circle.Aera(),circle.Permiter());

	}

}

class Shape{//����
	double x,y,r;
	public double Aera(){
		return x*y;
	}
	public double Permiter(){
		return x+y;
	}
}

class Rectangle extends Shape{
	public Rectangle(){//���������ι��췽������ʼ��
		x=30;y=20;
		System.out.println("x="+x+";y="+y);
	}
	public double Aera(){
		return x*y;
	}
	public double Permiter(){
		return 2*(x+y);
	}
	
}

class Circle extends Shape{
	public Circle(){//����԰���췽����������ʼ��
		r=10.0;
		System.out.println("r="+r);
	}
	public double Aera(){
		return 3.14*r*r;
	}
	public double Permiter(){
		return 6.28*r;
	}
	
}



