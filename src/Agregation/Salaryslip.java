package Agregation;

public class Salaryslip {
	public static void slip() {
		Salary v=new Salary();
		Pf x=new Pf();
		int l=v.basicsalary();
		int m=v.deduction();
		int o=v.bonus();
		int ts=l+x.calculatehra(l)-x.calculatepf(l)-m+o;
		System.out.println("Total salary:    "+ts);
		
	}
	public static void main(String args[]) {
		
		slip();
	}

}
