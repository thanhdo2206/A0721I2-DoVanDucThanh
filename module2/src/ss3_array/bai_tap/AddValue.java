package ss3_array.bai_tap;

import java.util.Scanner;

public class AddValue {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập kích thước mảng ");
		int size = sc.nextInt();
		int[] array = new int[size];
		int[] newArr = new int[size+1];
		
		

		for (int i = 0; i < size ; i++) {
			System.out.print("Nhập phần tử " + i + ":  ");
			array[i] = sc.nextInt();

		}

		System.out.print("Nhập số cần chèn :");
		int num = sc.nextInt();
		System.out.print("Nhập vị trí cần chèn : ");
		int index = sc.nextInt();
		
		if (index <= 1 || index >= size) {
			System.out.println("không chèn được phần tử vào mảng");
		} else {
			
			for (int i = 0 ; i < newArr.length; i++) {
				if( i > index) newArr[i] = array[i - 1];
				else if(i == index) newArr[i] = num;
				else newArr[i] = array[i];
				
			}

			
			
			System.out.println("Mảng đã thêm");
			for (int i = 0; i < newArr.length ; i++) {
				System.out.print(newArr[i] + "\t");
			}
		}

	}
}