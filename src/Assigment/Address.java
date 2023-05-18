package Assigment;

public class Address extends Student {
	Address(String name,int rollNo){
	    super(name,rollNo);	
	}
	public  void address() {
	System.out.println(super.name);
	System.out.println(super.rollNo);
	String address="MS Bhavan,kazhakoottam PO";
	System.out.println(address);
			}
public static void main(String args[]) {
	Address s=new Address("Lekshmi Raj", 5);
	
	s.address();
}
}
