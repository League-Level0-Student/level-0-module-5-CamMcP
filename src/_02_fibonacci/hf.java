package _02_fibonacci;

import javax.swing.JOptionPane;

public class hf {
public static void main(String[] args) {
	int A = 0;
	int B = 1;
	JOptionPane.showMessageDialog(null, A + " " + B);
	for (int i = 0; i < 11; i++) {
		int temp = A;
	A = B;
	B = B + temp;
	JOptionPane.showMessageDialog(null, B);
	}
}
}
