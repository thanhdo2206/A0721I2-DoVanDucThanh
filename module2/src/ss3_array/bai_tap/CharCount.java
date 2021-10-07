package ss3_array.bai_tap;

import java.util.Scanner;

public class CharCount {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		String str = "colennnnnnn";

		int count = 0;
		char strInput = 'n';
		for(int i =0 ; i< str.length();i++) {
			
			if(str.charAt(i) == strInput) count++;
		}
		
		
		System.out.println("Số lần xuất kí tự xuất hiện trong chuối : " + count );
	}
}
