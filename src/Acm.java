import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Acm {

	public static void main(String[] args) {
		Account account=new Account();
		System.out.println("Account:"+account.Account);
		System.out.println("name:"+account.name);
		System.out.println("id:"+account.id);
		System.out.println("Tel:"+account.Tel);
		System.out.println("Time:"+account.time);
		System.out.println("´æ¿î100");
		account.put(100.0);
		System.out.println("È¡¿î10");
		account.get(10);
		System.out.println("Óà¶î£º"+account.howmuch());
	}

}

class Account{
	Calendar c = Calendar.getInstance();
	Date date = c.getTime();
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	String time = sdf.format(date);
	
	String Account="20134323";
	String name="chenwi";
	String id="8888888";
	String Tel="180808080";
	double money;
	void put(double money){
		this.money=money;
	}
	double get(double money){
		return money;
	}
	double howmuch(){
		this.money-=get(10.0);
		return this.money;
	}
	
	
}



