package _07_skill_practice;

import javax.swing.JOptionPane;

import _01_prime_or_not.a;

public class Sk111z {
	public static void main(String[] args) {

		Sk111z skills = new Sk111z();
		skills.skill1();
		skills.skill2();
		skills.skill3();
		skills.skill4();
		skills.skill5();
	}

	void skill1() {
// Use pop-ups for the following.
// Ask the user how many dimes they have
		String money = JOptionPane.showInputDialog("How many dimes do you have?");
		int mone = Integer.parseInt(money);
		mone = mone * 10;
// Tell them how many cents they have (hint multiply by 10
		JOptionPane.showMessageDialog(null, "You have " + mone + " cents.");

// Ask the user how tall they are (inches)
		String inch = JOptionPane.showInputDialog("How tall are you in inches");
		int itch = Integer.parseInt(inch);

// If they are shorter than 36 inches, tell them to eat their Wheaties
		if (itch < 36) {
			JOptionPane.showMessageDialog(null, "Eat your wheaties, small person.");
		} else {
			JOptionPane.showMessageDialog(null, "Keep eating your wheaties.");
		}

	}

	void skill2() { // Write a loop to print every third number between 1 and 30 to the console
		for (int i = 1; i < 11; i++) {
			System.out.println(i * 3);
		}

	}

	void skill3() { // Get a random number that is less than 20 and print it to the console
		int Nineteen;
		Nineteen = ((int) (Math.random() * 20));

		// Get another random number that is less than 10 and print it to the console
		int Nine;
		Nine = ((int) (Math.random() * 10));

// Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
		JOptionPane.showMessageDialog(null,
				"The diffrence between " + Nineteen + " and " + Nine + " is " + (Nineteen - Nine) + ".");
	}

	void skill4() { // In a pop-up, ask the user for the city they live in
		String city = JOptionPane.showInputDialog("What city do you live in?");
// If they answered "San Diego", tell them they live in America's Finest City 
		if (city.equals("San Diego")) {
			JOptionPane.showMessageDialog(null, "You live in America's finest city");
		}
// Otherwise, tell them to move to San Diego 
		else {
			JOptionPane.showMessageDialog(null, "MOVE TO SAN DIEGO, MAGGOT!");
		}
// Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
		String Cars = JOptionPane.showInputDialog("How many cars does your family have?");
// If there is 1 car, use a pop-up to display the make/model of the car 
		if (Cars.equals(0)) {
			JOptionPane.showMessageDialog(null, "I bet you use public transport.");
		}
// If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
		else if (Cars.equals(1)) {
			JOptionPane.showMessageDialog(null, "You have ONE car.");
		}
		else {
			int car = Integer.parseInt(Cars);
			JOptionPane.showMessageDialog(null, "Your family has " + car + " wheels on your cars.");
		}
	}

	void skill5() { // In a pop-up, ask the user for the name of their school
String scool = JOptionPane.showInputDialog("What school do you go to?");
// In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message.
JOptionPane.showMessageDialog(null, "I have heard that " + scool + " is a fantastic school.");
	}
}