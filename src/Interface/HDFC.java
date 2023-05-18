package Interface;
import java.util.Scanner;
public class HDFC implements RBI {
	
	public void recurringDeposit(int a,int d) {
		
		
		int i=a+(a*d*r)/100;
	    System.out.println(i);
	    
		
	}
	public static void main(String args[]) {
		HDFC m=new HDFC();
		m.recurringDeposit(5000,3);
		
	}

}
