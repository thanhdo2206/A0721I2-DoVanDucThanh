package ss3_array.bai_tap;
import java.util.Scanner;

public class SumDiagonal {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("nhập size : ");
		int size = sc.nextInt();
		double[][] array = new double [size][size];
		
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print("nhập phần tử [" + i + "][" + j + "]");
				array[i][j] = sc.nextDouble();
			}
		}
		
		System.out.println("mảng đã nhập");
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				System.out.print(array[i][j] + "\t");
			}
			System.out.print("\n");
		}
		
		double sum =0;
		for(int i = 0 ; i<size;i++) {
			sum+= array[i][i];
		}
		
		System.out.println("Tông đường chéo chính của ma trận : " + sum);
	}
}