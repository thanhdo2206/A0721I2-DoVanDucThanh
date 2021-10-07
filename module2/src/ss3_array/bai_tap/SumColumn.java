package ss3_array.bai_tap;
import java.util.Scanner;
public class SumColumn {
	public static void input(double[][] array, int row, int col) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				System.out.print("nhập phần tử [" + i + "][" + j + "]");
				array[i][j] = sc.nextDouble();
			}
		}
	}

	public static void output(double[][] array, int row, int col) {
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
		double[][] array = new double[row][col];
		input(array, row, col);
		output(array, row, col);
		
		
		System.out.print("Bạn muốn tính tổng của cột mấy : ");
		int colInput = sc.nextInt();
		double sum = 0;
		for(int i = 0 ; i< array.length;i++) {
			sum+= array[i][colInput];
		}
		
		System.out.print("Tổng của cột "+colInput+ " là : " + sum);
	}
}
