package ss3_array.bai_tap;

import java.util.Scanner;

public class DeleteValue {
	public static void main(String[] args) {

		System.out.print("nhập số : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int[] array = { 1, 2, 3, 4, 5 };
		boolean check = false;
		int[] newArray = new int[array.length - 1];
		int index =0 ;
		
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				check = true;
				System.out.println("Vị trí được tìm thấy trong mảng : " + i);
				index = i;
				break;

			}
		}
		
		
		for (int i = 0; i < newArray.length ; i++) {
			if(i >= index) newArray[i] = array[i + 1];
			else newArray[i] = array[i];
		}
		
		

		if (check) {
			System.out.println("Mảng đã xóa");
			for (int i = 0; i < newArray.length; i++) {
				System.out.print(newArray[i] + "\t");
			}

		} else
			System.out.println("Không tìm thấy trong mảng");

	}
}