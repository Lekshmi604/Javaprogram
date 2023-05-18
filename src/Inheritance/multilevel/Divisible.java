package Inheritance.multilevel;

public class Divisible extends Addtwo  {
	public void n2() {
		
		if(n1()%10==0) {
			System.out.println("Number is divisible by 10");	
		}else {
			System.out.println("Number is not divisible by 10");
		}
	}
	
public static void main(String args[]) {
	Divisible l=new Divisible();
	l.n1();
	l.n2();
}
}
