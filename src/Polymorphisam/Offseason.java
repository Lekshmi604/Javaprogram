package Polymorphisam;

public class Offseason extends Onseason {
	@Override
	public int discount(int t) {
		int j=(t*40)/100;
		return j;
		
	}
	public static void main(String args[]) {
		Onseason p=new Onseason();
		Offseason q=new Offseason();
		System.out.println(p.discount(5000));
		System.out.println(q.discount(4000));
	}

}
