package _06_for_loop_gauntlet;
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
	
	for (int l = 99; l > 1; l--) {
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
	for (int i = 0; i < 777; i++) {
		if (i%7 == 0) {
			JOptionPane.showMessageDialog(null, i);
		}
		else {
			
		}
	}
for (int i = 0; i < 12; i++) {
	int j = 2008;
	JOptionPane.showMessageDialog(null, "In" + j + " , I was" + i + " years old" );
j++;
}
for (int i = 0; i < 1; i++) 	{
	int k = 0;
	 int m = 0;
	for (int j = 0; j < 3; j++) {
		JOptionPane.showMessageDialog(null, k + " " + m);
			m++;
	}
	int a = 1;
	int b = 0;
	for (int j = 0; j < 3; j++) {
		JOptionPane.showMessageDialog(null, a + " " + b);
	b++;	
	}
	int c = 2;
	int d = 0;
for (int j = 0; j < 3; j++) {
	JOptionPane.showMessageDialog(null, c + "  " + d);
d++;
}
	}
for (int i = 0; i < 1; i++) {
	int a = 1;
	int b = 2;
	int c = 3;
	for (int j = 0; j < 3; j++) {
		System.out.println(a + " " + b + " " + c);
		a += 3;
	b += 3;
c += 3;
	}
}
for (int i = 0; i < 1; i++) {
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	int e = 5;
	int f = 6;
	int g = 7;
	int h = 8;
	int j = 9;
	int k = 10;
	for (int l = 0; l < 10; l++) {
		System.out.println(a + " " + b + " " + c + " " + d + " " + e + " " + f + " " + g + " " + h + " " + j + " " + k);
	a += 10;
	b += 10;
	c += 10;
	d += 10;
	e += 10;
	f += 10;
	g += 10;
	h += 10;
	j += 10;
	k += 10;
	}
}
for (int i = 0; i < 1; i++) {
	String a = "*";
	for (int j = 0; j < 6; j++) {
		System.out.println(a);
	if (i == 0) {
		a = "* *";
	}
	else if (i == 1) {
		a = "* * *";
	}
	else if (i == 2) {
	a = "* * * *";
	}
	else if (i == 3) {
		a = "* * * * *";
	}
	else if (i == 4) {
		a = "* * * * * *";
	}
	else {
		
	}
	}
}
}
}