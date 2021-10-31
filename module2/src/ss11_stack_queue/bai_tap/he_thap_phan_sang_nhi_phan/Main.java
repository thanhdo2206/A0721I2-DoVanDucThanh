package ss11_stack_queue.bai_tap.he_thap_phan_sang_nhi_phan;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static Stack<Integer> stackNhiPhan = new Stack<Integer>() ;
	
	
	public static String daoNguocSo(Stack<Integer> stackNhiPhan) {
		String result ="";
		int length = stackNhiPhan.size();
		for(int i=0; i < length ;i++) {
			result += stackNhiPhan.pop();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
			
		Scanner sc = new Scanner(System.in);		
		System.out.print("Nhập hệ thập phân muốn chuyển :");		
		int numTen = sc.nextInt();
		
		while (numTen != 0) {
			int du = numTen%2;
			stackNhiPhan.push(du);
			numTen/=2;
		}
		
		System.out.println("Được chuyển sang hệ nhị phân là : " + daoNguocSo(stackNhiPhan));
		
		 
	}
}
