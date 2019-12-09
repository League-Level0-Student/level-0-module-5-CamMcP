import javax.swing.JOptionPane;

public class a {
public static void main(String[] args) {
	for (int i = 1; i < 100; i++) {
		JOptionPane.showMessageDialog(null, i);
	}
	
	for (int j = 100; j > 1; j--) {
		JOptionPane.showMessageDialog(null, j);
	}
	
	for (int k = 2; k < 100; k++) {
		JOptionPane.showMessageDialog(null, k);
	}
	
	for (int l = 99; l < 1; l++) {
		JOptionPane.showMessageDialog(null, l);
	}
	
	for (int i = 0; i < 500; i++) {
		if (i%2 == 0) {
		JOptionPane.showMessageDialog(null, i + " is even");
		}
else {
		JOptionPane.showMessageDialog(null, i + " is odd");	
		}
	}
	}
}

