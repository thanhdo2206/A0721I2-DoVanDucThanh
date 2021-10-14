package ss1_introduction_to_java.bai_tap;
import java.util.Scanner;
public class Money {
	public static void main(String[] args) {
		
		double rate = 23000;
		Scanner scanner = new Scanner(System.in);
		System.out.print("Mời bạn nhập số tiền USD : ");
		double USD = scanner.nextDouble();
		double VND = USD * rate;
		System.out.print("Số tiền VND : " + VND);
		
		
		
	}
}