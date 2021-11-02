package ss13.thuat_toan_tim_kiem.bai_tap;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {

		String string = "Welcome";

		ArrayList<Character> list = new ArrayList<>();

		for (int i = 0; i < string.length(); i++) {

			// Khai báo một linked list trung gian các kí tự của chuỗi tăng dần
			ArrayList<Character> listTemp = new ArrayList<>();

			listTemp.add(string.charAt(i));

			for (int j = i + 1; j < string.length(); j++) {

				// Kiểm tra kí tự tiếp theo có lớn hơn kí tự cuối trong listTemp đã sắp xếp tăng
				// dần
				// nếu lớn hơn thì thêm tiếp vào listTemp

				if (string.charAt(j) > listTemp.get(listTemp.size() - 1)) {

					listTemp.add(string.charAt(j));
				}
			}

			// So sánh kích cỡ của listTemp trung gian và list chứa chuỗi tăng dần 

			if (listTemp.size() > list.size()) {
				list.clear();
				list.addAll(listTemp);
			}

		}

		// Hiển thị chuỗi tăng dần dài nhất
		for (Character listItem : list) {
			System.out.print(listItem);
		}

	}
}
