package _01_prime_or_not;

import javax.swing.JOptionPane;

public class a {
public static void main(String[] args) {
	String Number = JOptionPane.showInputDialog("Pick any nine-diget number not spelled with words.");
	int num = Integer.parseInt(Number); 
	for (int i = 2; i < num; i++) {
		if (num % i == 0) {
			JOptionPane.showMessageDialog(null, "Your number is not prime.");
			System.exit(0);		
			}
	}
	JOptionPane.showMessageDialog(null, "Your number is prime.");
	
	
	
	
	
	
	
	
}
}