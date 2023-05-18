package Lekshmi;
import java.util.Scanner;
public class Arrayduplicate {
	public static void main(String args[]) {
	int ar[]= {1,2,8,8,2};
	System.out.println("Check the value");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	
	
	int count=0;
	for(int i=0;i<ar.length;i++) {
		if(ar[i]==a) {
			count++;
			continue;	
		}}
		if(count>1) {
			System.out.println("Duplicate is present");
		}
		else {
			System.out.println("No duplicate");
		}
	}
		
	}
	
	


