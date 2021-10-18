package ss6_ke_thua.bai_tap.bai_tap_point_2;

public class Main {
	public static void main(String[] args) {
		Point point = new Point(2, 4);
		System.out.println(point);

		MoveablePoint movPoint = new MoveablePoint(4,3, 6, 7);
		System.out.println(movPoint);
		
		 System.out.println(movPoint.move()); 

		movPoint.move();
		System.out.println(movPoint);
	}
}
