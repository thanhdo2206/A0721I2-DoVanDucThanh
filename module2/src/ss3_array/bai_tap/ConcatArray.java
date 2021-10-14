package ss3_array.bai_tap;


import java.util.Scanner;

public class ConcatArray {

	public static void input(int[] array) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < array.length; i++) {
			System.out.print("nhâp vào phần tử " + i + ":");
			array[i] = sc.nextInt();
		}
	}

	public static void output(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + "\t");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập kích thước mảng 1 : ");
		int size1 = sc.nextInt();
		System.out.print("nhập kích thước mảng 2 : ");
		int size2 = sc.nextInt();
		int[] array1 = new int[size1];
		int[] array2 = new int[size2];
		int[] array3 = new int[size1 + size2];
		System.out.println("Nhập phần tử vào mảng 1 :");
		input(array1);
		System.out.println("Nhập phần tử vào mảng 2 :");
		input(array2);

		for (int i = 0; i < array1.length; i++) {
			array3[i] = array1[i];
		}

		for (int i = array1.length, j = 0; i < array3.length; i++, j++) {

			array3[i] = array2[j];
		}
		
		System.out.println("mảng được gộp là : ");
		output(array3);

	}

}