package Lekshmi;

public class Letter {
	public static void main(String args[]) {
		String s="How are you";
		char toFind='o';
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)==toFind) {
				count++;			
			}
			
			
		}
		System.out.println("Number of Os=" +count);
	
	}

}
