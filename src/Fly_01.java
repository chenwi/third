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
		System.out.println("鸟类是生蛋的！");
	}
	public void fly(){
		System.out.println("鸟是可以飞的！");
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
		System.out.println("昆虫是产卵的！");
	}
	public void fly(){
		System.out.println("昆虫也是能飞的！");
	}
}

public class Fly_01 {
	public static void main(String[] args) {
		
		Bird dove=new Bird();
		Insect ant=new Insect();
		System.out.println("dove有"+dove.leg()+"条腿。");
		dove.fly();dove.lay();
		System.out.println("ant有"+ant.leg()+"条腿。");
		ant.fly();ant.egg();
		
	}

}