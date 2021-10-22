package ss7_abstract_class.bai_tap.colorable_cac_lop_hinh_hoc;



public class RectangleTest {
	public static void main(String[] args) {
		Rectangle[] rectangles = new Rectangle[20];

		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Rectangle(20, 10);
		}

		for (int i = 0; i < rectangles.length; i++) {
			System.out.println("=======================================================");
			System.out.println("Shape " + (i + 1) + " :");
			System.out.println("Area before resize: " + rectangles[i].getArea());
			rectangles[i].howToColor();

		}
	}
}
