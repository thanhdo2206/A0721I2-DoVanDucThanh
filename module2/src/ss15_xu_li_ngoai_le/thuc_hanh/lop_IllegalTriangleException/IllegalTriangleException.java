package ss15_xu_li_ngoai_le.thuc_hanh.lop_IllegalTriangleException;

import java.util.Scanner;

public class IllegalTriangleException {

	public static double Triangle(double side1, double side2, double side3) {

		if (side1 <= 0 || (side1 + side2) < side3 || (side1 + side3) < side2) {
			throw new IllegalArgumentException("Giá trị không hợp lệ");
		} else if (side2 <= 0 || (side2 + side3) < side1) {
			throw new IllegalArgumentException("Giá trị không hợp lệ");
		} else if (side3 <= 0) {
			throw new IllegalArgumentException("Giá trị không hợp lệ");
		} else {
			throw new IllegalArgumentException("Giá trị hợp lệ");

		}

	}

	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.println("Nhập độ dài ba cạnh: ");

		double x = input.nextDouble();
		double y = input.nextDouble();
		double z = input.nextDouble();

		try {
			double result = Triangle(x, y, z);
			System.out.println("Giá trị hợp lệ");

		} catch (Exception e) {
			System.out.println("Exception: Giá trị không hợp lệ");
		}
		System.out.println("Exception continues......");



	}


}
