package ss6_ke_thua.bai_tap.bai_tap_point_2;

public class Main {
	public static void main(String[] args) {
		Point point = new Point(2, 4);
		System.out.println(point);

		MoveablePoint movPoint = new MoveablePoint(4, 5, 6, 7);
		System.out.println(movPoint);
		movPoint.setSpeed(9, 10);
		System.out.print("mảng chứa hai speed:");
		float[] arr = movPoint.getSpeed();
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
