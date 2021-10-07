package ss3_array.bai_tap;

import java.util.Scanner;

public class FindMaxArrayTwo {

	public static void input(int[][] array, int row, int col) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("nhập phần tử [" + i + "][" + j + "]");
				array[i][j] = sc.nextInt();
			}
		}
	}

	public static void output(int[][] array, int row, int col) {
		System.out.println("mảng đã nhập");
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập số hàng ");
		int row = sc.nextInt();
		System.out.print("nhập số cột ");
		int col = sc.nextInt();
		int[][] array = new int[row][col];
		input(array, row, col);
		output(array, row, col);

		int indexRow = 0;
		int indexCol = 0;
		int max = array[0][0];

		for (int i = 0; i < row; i++) {
			for (int j = 1; j < col; j++) {
				if (array[i][j] > max) {
					max = array[i][j];
					indexRow = i;
					indexCol = j;
				}
			}
		}
		
		System.out.println("phần trử max ở vị trí : [" + indexRow + "][" + indexCol + "]");
		System.out.print("giá trị lớn nhất là " + max);
	}
}
