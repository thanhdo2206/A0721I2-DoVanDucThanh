package ss2_loop.bai_tap;
import java.util.Scanner;
public class RenderPrime {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("nhập số lượng số nguyên tố cần hiển thị : ");
		int numbers = sc.nextInt();
		int N =2;
		int count = 0;
		String result ="";
		
		while(count < numbers)  {
			int j = 2;
			boolean check = true;
			while (j <= Math.sqrt(N)) {
				if (N % j == 0) {
					check = false;
					break;
				}
				j++;
			}

			if (check) {
				result += N +",";				
				count++;
			}
			
			N++;

		}
		
		System.out.println("Các số nguyên tố từ 2 -> 100 :" + result);
	}
}
