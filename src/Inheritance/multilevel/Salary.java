package Inheritance.multilevel;
import java.util.Scanner;
public class Salary {

	public int basicpay() {
	System.out.println("Basicpay:  ");
	Scanner s=new Scanner(System.in);
	int b=s.nextInt();
	return b;
	}
	
	public int deduction() {
		System.out.println("Deduction:  ");
		Scanner s=new Scanner(System.in);
		int d=s.nextInt();
		return d;
	}
	
	public int bonus() {
		System.out.println("Bonus:  ");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		return c;
	}
}
