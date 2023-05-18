package Inheritance.multilevel;

public class Salaryslip extends Pfhra {
	public static void salaryslip() {
	Pfhra t=new Pfhra();
	int l=t.basicpay();
	int m=t.deduction();
	int n=t.bonus();
	int o=t.pf();
	int p=t.hra();
	int ts=l+n+p-o-m;
	System.out.println(ts);
	}

public static void main(String args[]) {
	salaryslip();

}}
