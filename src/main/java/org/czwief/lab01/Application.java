package org.czwief.lab01;

import org.czwief.lab01.calculator.Calculator;

import java.util.Scanner;

public class Application
{
    public static void main(String[] args)
	{
		Application app = new Application();
		app.runCalculatorDemo();
    }

	private void runCalculatorDemo()
	{
		Calculator calculator = new Calculator();
        Scanner keyboardInput = new Scanner(System.in);

		while (true) {
			System.out.println("Welcome to the calculator demo!");
			System.out.print("Enter an integer: ");
			int anInteger = keyboardInput.nextInt();
			System.out.print("Enter another integer: ");
			int anotherInt = keyboardInput.nextInt();
			System.out.println("What do you want to do? ");
			String choice = keyboardInput.next().trim().toLowerCase();

			if ("+".equals(choice) || "add".equals(choice)) {
				System.out.println("Adding these two together makes: " + calculator.add(anInteger, anotherInt));
			}
			else if ("-".equals(choice) || "subtract".equals(choice)) {
				System.out.println("Subtracting these two together makes: " + calculator.subtract(anInteger, anotherInt));
			}
			else if ("*".equals(choice) || "multiply".equals(choice)) {
				System.out.println("Subtracting these two together makes: " + calculator.multiply(anInteger, anotherInt));
			}
			else if ("/".equals(choice) || "divide".equals(choice)) {
				System.out.println("Subtracting these two together makes: " + calculator.divide(anInteger, anotherInt));
			}
			else {
				System.out.println("Sorry, that doesn't make sense to me.");
			}
		}
	}
}
