package Assigment;

public class Divisible extends Addition {
	 Divisible(int a,int b) {
		super(a,b);
	}
	 public void divisible() {
		 if(addition()%10==0) {
			 System.out.println("Divisible");
		 }else {
			 System.out.println("Not divisible");
			 
		 }}
	 public static void main(String args[]) {
		 Divisible s=new Divisible(10,5);
		 s.divisible();
		 
	 }
			
	
	 }


