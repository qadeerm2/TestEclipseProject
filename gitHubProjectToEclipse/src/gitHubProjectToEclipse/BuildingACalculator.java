package gitHubProjectToEclipse;

import java.util.Scanner;

public class BuildingACalculator {

	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.print("Enter your first Number: ");
		double num1 = keyboardInput.nextDouble();
		System.out.print("Enter your second Number: ");
		double num2 = keyboardInput.nextDouble();
		double sum = num1 + num2;
		
		System.out.println("Sum of num1 and num2 is: "+ sum);
		
		
	}
	

}
