package ss7_abstract_class.bai_tap.colorable_cac_lop_hinh_hoc;



public class CircleTest {
	public static void main(String[] args) {
		Circle[] circles = new Circle[20];
		
		for (int i = 0; i < circles.length; i++) {
            circles[i] = new Circle(10);
        }
		
		for (int i = 0; i < circles.length; i++) {
            System.out.println("=======================================================");
            System.out.println("Shape " + (i + 1) + " :");
            System.out.println("Area : " + circles[i].getArea());
           
           
        }
		
	}
}
