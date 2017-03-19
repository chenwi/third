
public class Stu_01 {
    
    public static void main(String[] args) {
    	
    	// TODO, add your application code
    	System.out.println("Hello World!");
    	person p1=new Chinese();
    	p1.say();
    	person p2=new American();
    	p2.say();
    }
    }

class person{
	public void say() {
		// TODO Auto-generated method stub
		 System.out.println("有说话能力");
	}
}

 class Chinese extends person{
	public void say(){
		System.out.println("中国人说中国话");
	}
}

 class American extends person{
	public void say(){
		System.out.println("美国人说英语");
	}
}








