package Agregation;

public class Circle {
	public  void n1() {
		Square v = new Square();
		int d=v.area(5);
		double cirarea=3.14*d;
		System.out.println(cirarea);
	}
	public static void main(String args[]) {
		Circle n1=new Circle();
		n1.n1();
		
		
	}

}
