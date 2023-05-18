package Assigment;
import java.util.Scanner;
public class User extends Bank {
	public void getdetails() {
		Bank n=new Bank();
		n.setPin(getPin());
		System.out.println("Enter the pin");
		Scanner s=new Scanner(System.in);
		int c=s.nextInt();
		if(c==1234||c==1001||c==1212) {
			System.out.println("Valid pin");
		}
		else {
			System.out.println("Invalid pin");
		}}
		public static void main(String args[]) {
			User b=new User();
			b.getdetails();
		
	}
	
	

}
