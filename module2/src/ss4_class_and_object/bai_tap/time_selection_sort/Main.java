package ss4_class_and_object.bai_tap.time_selection_sort;

public class Main {
	public static void main(String[] args) {
		StopWatch time = new StopWatch();
		time.start();

		int arr[] = { 64, 25, 12, 22, 11 };
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int min_idx = i;
			for (int j = i + 1; j < n; j++)
				if (arr[j] < arr[min_idx])
					min_idx = j;

			
			int temp = arr[min_idx];
			arr[min_idx] = arr[i];
			arr[i] = temp;
		}

		time.stop();
		System.out.println("ElapsedTime = " + time.getElapsedTime());

	}
}
