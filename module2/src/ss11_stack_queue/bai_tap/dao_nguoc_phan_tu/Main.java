package ss11_stack_queue.bai_tap.dao_nguoc_phan_tu;

import java.util.Arrays;

import java.util.Stack;

public class Main {

	public static Stack<Integer> stackInt = new Stack<Integer>();
	public static Stack<String> stackString = new Stack<String>();

	public static void reverseInt() {
		int[] arrInt = { 1, 2, 3, 4 };
		for (int i = 0; i < arrInt.length; i++) {
			stackInt.push(arrInt[i]);
		}

		System.out.println("Mảng trước khi đảo ngược :" + Arrays.toString(arrInt));
		for (int i = 0; i < arrInt.length; i++) {
			arrInt[i] = stackInt.pop();
		}

		System.out.println("Mảng sau khi đảo ngược :" + Arrays.toString(arrInt));
	}
	
	public static void reverseString() {
		String str = "Do Van Duc Thanh";
		
		for(int i =0;i< str.length();i++) {
			stackString.push(str.charAt(i) + "");		
		}		
		System.out.println("Chuỗi trước khi đảo ngược :" + str);
		
		String result ="";
		int length = stackString.size();
		for(int i =0;i< length;i++) {
			result +=stackString.pop();		
		}
		
		System.out.println("Chuỗi sau khi đảo ngược :" + result);
		
	}

	public static void main(String[] args) {
		
		reverseInt();
		
		reverseString();
	}
}
