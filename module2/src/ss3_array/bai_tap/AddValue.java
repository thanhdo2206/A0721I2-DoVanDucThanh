package ss3_array.bai_tap;

import java.util.Scanner;

public class AddValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[10];

		for (int i = 0; i < array.length; i++) {
			System.out.print("Nhập phần tử (nhập 0 để dừng) " + i + ":  ");
			array[i] = sc.nextInt();
			if (array[i] == 0)
				break;
		}

		System.out.print("Nhập số cần chèn :");
		int num = sc.nextInt();
		System.out.print("Nhập vị trí cần chèn : ");
		int index = sc.nextInt();
		if (index <= 1 || index >= array.length - 1) {
			System.out.println("không chèn được phần tử vào mảng");
		} else {
			for (int i = array.length - 1; i > index; i--) {
				array[i] = array[i - 1];
			}
			array[index] = num;

			System.out.println("Mảng đã thêm");
			for (int i = 0; i < array.length; i++) {
				System.out.print(array[i] + "\t");
			}
		}

	}
}
