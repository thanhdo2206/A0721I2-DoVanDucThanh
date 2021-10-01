package ss1_introduction_to_java.bai_tap;

import java.util.Scanner;

public class NumberToString {

	public static void main(String[] args) {
		NumberToString thanh = new NumberToString();
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập số nguyên cần đọc : ");
		int num = sc.nextInt();		
		String str = "";

		if (num < 10) {
			if (num >= 0) {
				switch (num) {
				case 0:
					str = "zero";
					break;
				case 1:
					str = "one";
					break;
				case 2:
					str = "two";
					break;
				case 3:
					str = "three";
					break;
				case 4:
					str = "four";
					break;
				case 5:
					str = "fine";
					break;
				case 6:
					str = "six";
					break;
				case 7:
					str = "seven";
					break;
				case 8:
					str = "eight";
					break;
				case 9:
					str = "nine";
					break;

				}
			}

		} else if (num < 20) {

			int ones = num % 10;
			switch (ones) {
			case 0:
				str = "ten";
				break;
			case 1:
				str = "elven";
				break;
			case 2:
				str = "twelve";
				break;
			case 3:
				str = "thirteen";
				break;
			case 4:
				str = "fourteen";
				break;
			case 5:
				str = "fifteen";
				break;
			case 6:
				str = "sixteen";
				break;
			case 7:
				str = "seventeen";
				break;
			case 8:
				str = "eighteen";
				break;
			case 9:
				str = "nineteen";
				break;
			}

		} else if (num < 100) {
			int tens = num / 10;
			int ones = num % 10;
			String strOnes = "";
			String strTens = "";

			switch (ones) {
			case 0:
				strOnes = "";
				break;
			case 1:
				strOnes = "one";
				break;
			case 2:
				strOnes = "two";
				break;
			case 3:
				strOnes = "three";
				break;
			case 4:
				strOnes = "four";
				break;
			case 5:
				strOnes = "fine";
				break;
			case 6:
				strOnes = "six";
				break;
			case 7:
				strOnes = "seven";
				break;
			case 8:
				strOnes = "eight";
				break;
			case 9:
				strOnes = "nine";
				break;
			}

			switch (tens) {
			case 2:
				strTens = "twenty ";
				break;
			case 3:
				strTens = "thirdty ";
				break;
			case 4:
				strTens = "fourty ";
				break;
			case 5:
				strTens = "fifty ";
				break;
			case 6:
				strTens = "sixty ";
				break;
			case 7:
				strTens = "seventy ";
				break;
			case 8:
				strTens = "eighty ";
				break;
			case 9:
				strTens = "ninety ";
				break;

			}

			str = strTens + strOnes;

		} else if (num <= 999) {
			int hundreds = num / 100;
			int tensAndOnes = num % 100;
			int tens = tensAndOnes / 10;
			int ones = tensAndOnes % 10;
			String strOnes = "";
			String strTens = "";
			String strHundreds = "";

			switch (hundreds) {
			case 1:
				strHundreds = "one";
				break;
			case 2:
				strHundreds = "two";
				break;
			case 3:
				strHundreds = "three";
				break;
			case 4:
				strHundreds = "four";
				break;
			case 5:
				strHundreds = "fine";
				break;
			case 6:
				strHundreds = "six";
				break;
			case 7:
				strHundreds = "seven";
				break;
			case 8:
				strHundreds = "eight";
				break;
			case 9:
				strHundreds = "nine";
				break;
			}

			switch (tens) {
			case 2:
				strTens = "twenty ";
				break;
			case 3:
				strTens = "thirdty ";
				break;
			case 4:
				strTens = "fourty ";
				break;
			case 5:
				strTens = "fifty ";
				break;
			case 6:
				strTens = "sixty ";
				break;
			case 7:
				strTens = "seventy ";
				break;
			case 8:
				strTens = "eighty ";
				break;
			case 9:
				strTens = "ninety ";
				break;
			}

			switch (ones) {
			case 0:
				strOnes = "";
				break;
			case 1:
				strOnes = "one";
				break;
			case 2:
				strOnes = "two";
				break;
			case 3:
				strOnes = "three";
				break;
			case 4:
				strOnes = "four";
				break;
			case 5:
				strOnes = "fine";
				break;
			case 6:
				strOnes = "six";
				break;
			case 7:
				strOnes = "seven";
				break;
			case 8:
				strOnes = "eight";
				break;
			case 9:
				strOnes = "nine";
				break;
			}

			str = strHundreds + "hundred" + " and " + strTens + strOnes;

		} else
			str = "out of ability";

		System.out.printf("%d đọc là : %s", num, str);

	}
}
