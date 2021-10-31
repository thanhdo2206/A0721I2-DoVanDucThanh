package ss11_stack_queue.bai_tap.kiem_tra_dau_ngoac;

import java.util.Stack;

public class Main {
	public static Stack<String>  bStack = new Stack<String>();
	
	public static boolean check(String str) {
		for(int i=0;i<str.length();i++) {
			
			int temp = (int)str.charAt(i);
			if(temp == 40) {
				bStack.push(str.charAt(i)+ "");
			}else if(temp == 41) {
				if(bStack.isEmpty()) return false;
				else bStack.pop();
			}
		}
		
		//kiểm tra trường hợp dư ngoặc trái
		if(bStack.size() > 0) return false;
		
		return true;
	}
	
	public static void main(String[] args) {
		
		
		
		String str = "(– b + (b2 – 4*a*c)^0.5) / 2*a";
		if(check(str)) System.out.println("Well");
		else System.out.println("Not well");
		
		
	}
}	
