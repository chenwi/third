interface Fly{
	public void fly();
}

class Bird implements Fly{
	public int leg;
	public Bird(){
		leg=2;
	}
	int leg(){
		return leg;
	}
	void lay(){
		System.out.println("�����������ģ�");
	}
	public void fly(){
		System.out.println("���ǿ��Էɵģ�");
	}
}

class Insect implements Fly{
	int leg;
	public Insect() {
		leg=6;
	}
	int leg(){
		return leg;
	}
	void egg(){
		System.out.println("�����ǲ��ѵģ�");
	}
	public void fly(){
		System.out.println("����Ҳ���ܷɵģ�");
	}
}

public class Fly_01 {
	public static void main(String[] args) {
		
		Bird dove=new Bird();
		Insect ant=new Insect();
		System.out.println("dove��"+dove.leg()+"���ȡ�");
		dove.fly();dove.lay();
		System.out.println("ant��"+ant.leg()+"���ȡ�");
		ant.fly();ant.egg();
		
	}

}