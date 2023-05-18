package Inheritance.multilevel;

public class Pfhra extends Salary {
	public int pf() {
	int pf=(basicpay()*20)/100;
	System.out.println("PF:  "+pf);
	return pf;
	}
	
	public int hra() {
	int hra=(basicpay()*5)/100;
	System.out.println("hra:  "+hra);
	return hra;

}}
