
public class Figure {
	
public void Print(double s,double c){//定义Print方法
	System.out.println("面积是："+s+";周长是："+c);
}
	public static void main(String[] args) {
		Figure fig=new Figure();
		Shape rectangle=new Rectangle();
		Shape circle=new Circle();
		fig.Print(rectangle.Aera(),rectangle.Permiter());
		fig.Print(circle.Aera(),circle.Permiter());

	}

}

class Shape{//父类
	double x,y,r;
	public double Aera(){
		return x*y;
	}
	public double Permiter(){
		return x+y;
	}
}

class Rectangle extends Shape{
	public Rectangle(){//子类三角形构造方法及初始化
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
	public Circle(){//子类园构造方法及参数初始化
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



