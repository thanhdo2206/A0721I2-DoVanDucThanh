package ss3_array.bai_tap;

import java.util.Scanner;

public class DeleteValue {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };
		System.out.print("nhập số : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean check = false;
		for (int i = 0; i < array.length; i++) {
			if (num == array[i]) {
				check = true;
				System.out.println("Vị trí được tìm thấy trong mảng : " + i);
				for(int j=i;j<array.length -1;j++) {
					array[j] = array[j+1];
				}
				array[array.length-1] = 0;		
				
			}
		}
		
		if(check) {
			System.out.println("Mảng đã xóa");
			for(int i =0 ; i< array.length;i++) {
				System.out.print(array[i] + "\t");
			}
			
		}else System.out.println("Không tìm thấy trong mảng");
		
		

	}
}
