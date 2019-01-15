package gC_lab3;

import java.util.Scanner;

public class lab3_01 {

	public static void main(String[] args) {

		int userNum;
		String choice = "y";

		while (choice.equalsIgnoreCase("y")) {

			Scanner scnr = new Scanner(System.in);

			System.out.println("Please enter your name.");
			String userName = scnr.nextLine();

			do {

				System.out.println("Thanks " + userName + ", now enter an integer between 1 and 100.");
				userNum = scnr.nextInt();

			} while (userNum < 1 || userNum > 100);

			if (userNum % 2 != 0 && userNum < 60) {
				System.out.println(userNum + " is Odd, " + userName + ".");
			} else if (userNum % 2 == 0 && userNum < 25) {
				System.out.println("Even and less than 25, " + userName + ".");
			} else if (userNum % 2 == 0 && userNum <= 60) {
				System.out.println("Even, " + userName + ".");
			} else if (userNum % 2 == 0 && userNum > 60) {
				System.out.println(userNum + " is Even, " + userName + ".");
			} else if (userNum % 2 != 0 && userNum > 60) {
				System.out.println(userNum + " is odd and over 60, " + userName + ".");
			}

			System.out.println("Press Y to continue. Press any other key to exit.");
			choice = scnr.next();

		}
		System.out.println("Thanks for taking part in this ground breaking math program.");
	}
}
