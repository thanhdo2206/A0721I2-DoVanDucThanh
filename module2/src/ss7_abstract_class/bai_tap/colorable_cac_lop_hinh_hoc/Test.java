package ss7_abstract_class.bai_tap.colorable_cac_lop_hinh_hoc;

public class Test {
	public static void main(String[] args) {
		Shape[] shapes = new Shape[10];

		for (int i = 0; i < shapes.length; i++) {
			if (i == 2 || i == 5) {
				
				//ép kiểu ngầm định từ rectangle về shape
				shapes[i] = new Rectangle(20, 10);

			} else {
				
				//ép kiểu ngầm định từ circle về shape (con về cha)
				shapes[i] = new Circle(10);

			}

		}

		for (int i = 0; i < shapes.length; i++) {
			System.out.println("========================");
			System.out.println("Shape " + (i) + " :");
			System.out.println(shapes[i].toString());
			if (shapes[i] instanceof Circle) {
				//ép kiểu tường minh từ shape về cirle (cha về con)
				double areaCircle = ((Circle) shapes[i]).getArea();
				System.out.println("Area : " + areaCircle);

			} else {
				double areaRectangle = ((Rectangle) shapes[i]).getArea();
				System.out.println("Area : " + areaRectangle);
			}

			if (shapes[i] instanceof Colorable) {
				((Rectangle) shapes[i]).howToColor();
			}

		}

	}
}
