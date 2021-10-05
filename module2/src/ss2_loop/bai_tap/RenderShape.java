package ss2_loop.bai_tap;

import java.util.Scanner;

public class RenderShape {
	public static void main(String[] args) {
		int choice;
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1.Print the rectangle");
			System.out.println("2.Print the square triangle");
			System.out.println("3.Print isosceles triangle");
			System.out.println("4.Exit");
			System.out.print("Enter your choice : ");
			choice = sc.nextInt();
			System.out.println("");
			switch (choice) {
			case 1:
				for (int i = 1; i <= 3; i++) {
					for (int j = 1; j <= 5; j++) {
						System.out.print("*");
					}

					System.out.println("");
				}
				break;
			case 2:

				System.out.println("botton-left");
				for (int i = 1; i <= 5; i++) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}

				System.out.println("top-left");
				for (int i = 5; i >= 1; i--) {
					for (int j = 1; j <= i; j++) {
						System.out.print("*");
					}
					System.out.println("");
				}

				break;
			case 3:
				int h = 5;
				for (int i = 1; i <= h; i++) {
					for (int j = 1; j < 2 * h; j++) {
						if (h - i < j && j < h + i) System.out.print("*");
						else System.out.print(" ");
							

					}
					System.out.println("");
				}
				break;

			}

		} while (choice != 4);
	}
}
