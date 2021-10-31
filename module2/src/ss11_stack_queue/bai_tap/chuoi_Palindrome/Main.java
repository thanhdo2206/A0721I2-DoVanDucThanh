package ss11_stack_queue.bai_tap.chuoi_Palindrome;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		Stack<String> stack = new Stack<String>();
		
		String str = "Able was I ere I saw Elba";
		String newStr = str.toLowerCase();
		int length = newStr.length();
		
		for(int i=0;i<length;i++) {
			queue.offer(newStr.charAt(i)+"");
			stack.push(newStr.charAt(i)+"");
		}
		
		
		int count = 0;
		for(int i = 0 ; i< length ; i++) {
			String strQueue = queue.poll();
			String strStack = stack.pop();
			if(strQueue.equals(strStack) ) {
				count++;
			}else {
				break;
			}
		}
		
		if(count == length) System.out.println( str + " là chuỗi Palindrome");
		else System.out.println( str + " không phải chuỗi Palindrome");
		
	}
}
