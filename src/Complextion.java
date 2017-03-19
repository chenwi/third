class complex{
	double RealPart,ImaginaryPart;
	/*public complex(){
		RealPart=1.0;
		ImaginaryPart=2.0;
	}*/
	public complex(double RealPart,double ImahinaryPart){
		this.RealPart=RealPart;
		this.ImaginaryPart=ImahinaryPart;
	}
	void add(complex a,complex b){
		 double sum_a=a.RealPart+b.RealPart;
		 double sum_b=a.ImaginaryPart+b.ImaginaryPart;
		System.out.println("加法结果为："+sum_a+"+"+sum_b+"*I");
	}
	void subtract(complex a,complex b){
		double sub_a=(a.RealPart-b.RealPart);
		double sub_b=a.ImaginaryPart-b.ImaginaryPart;
		System.out.println("减法结果为："+sub_a+"+"+sub_b+"*I");
	}
	void multiply(complex a,complex b){
		double mult_a=a.RealPart*b.RealPart-a.ImaginaryPart*b.ImaginaryPart;
		double mult_b=a.RealPart*b.ImaginaryPart+a.ImaginaryPart*b.RealPart;
		System.out.println("乘法结果为："+mult_a+"+"+mult_b+"*I");
	}
}

public class Complextion {
	public static void main(String[] args) {
		complex a=new complex(3,4);
		complex b=new complex(1,2);
		a.add(a,b);
		b.subtract(a, b);
		b.multiply(a, b);
	}

}
