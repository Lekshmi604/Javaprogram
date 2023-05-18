package Inheritance.multilevel;

public class Display extends Student {
	
	Display(String name, int Rollno) {
		super(name, Rollno);
		
	}

	public void display() {
		System.out.println(super.name);
		System.out.println(super.Rollno);
		
	}

	public static void main(String args[]) {
	Display s=new Display("Lekshmi Raj",10);
	s.display();
}

}
