package ss2_loop.bai_tap;

public class PrimeLessThanHundred {
	public static void main(String[] args) {
		String result ="";
		for (int i = 2; i <= 100; i++) {
			int j = 2;
			boolean check = true;
			while (j <= Math.sqrt(i)) {
				if (i % j == 0) {
					check = false;
					break;
				}
				j++;
			}

			if (check) result += i +",";
				
			

		}
		
		System.out.println("Các số nguyên tố từ 2 -> 100 :" + result);

	}
}
