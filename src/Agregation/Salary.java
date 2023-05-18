package Agregation;
import java.util.Scanner;
public class Salary {
	
	public  int basicsalary() {
		System.out.println("Basic Pay:   ");
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
		int a=s.nextInt();
		return a;

		
	}
	
		}


