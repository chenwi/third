
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
		 System.out.println("��˵������");
	}
}

 class Chinese extends person{
	public void say(){
		System.out.println("�й���˵�й���");
	}
}

 class American extends person{
	public void say(){
		System.out.println("������˵Ӣ��");
	}
}








