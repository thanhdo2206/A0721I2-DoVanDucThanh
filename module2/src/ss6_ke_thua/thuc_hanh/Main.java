package ss6_ke_thua.thuc_hanh;

public class Main {
	public static void main(String[] args) {

		// Shape Test
		Shape shape = new Shape();
		System.out.println(shape);

		shape = new Shape("red", false);
		System.out.println(shape);

		System.out.println("");
		// circle test
		Circle circle = new Circle();
		System.out.println(circle);

		circle = new Circle(3.5);
		System.out.println(circle);

		circle = new Circle(3.5, "indigo", false);
		System.out.println(circle);

		System.out.println("");
		// Rectangle test
		Rectangle rectangle = new Rectangle();
		System.out.println(rectangle);

		rectangle = new Rectangle(2.3, 5.8);
		System.out.println(rectangle);

		rectangle = new Rectangle(2.5, 3.8, "orange", true);
		System.out.println(rectangle);

		System.out.println("");
		// Square test
		Square square = new Square();
		System.out.println(square);

		square = new Square(2.3);
		System.out.println(square);

		square = new Square(5.8, "yellow", true);
		System.out.println(square);

	}
}
