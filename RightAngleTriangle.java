package mockinterviewquestion;

import java.util.Scanner;

public class RightAngleTriangle {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of rows: ");
		// Taking the number of rows as input
		int rows = input.nextInt();

		// Outer loop for the number of rows
		for (int i = 1; i <= rows; i++) {
			// Inner loop for the number of stars in each row
			for (int j = 1; j <= i; j++) {
				// Printing the star
				System.out.print("* ");
			}
			// Moving to the next line for the next row
			System.out.println();
		}
	}
}
