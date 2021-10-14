package ss5_access_modifier_and_static.bai_tap.access_modifier;

public class TestCircle {
	public static void main(String[] args) {
		Circle circle = new Circle(2);
		System.out.println("Radius = "+ circle.getRadius());	
		System.out.println("Area = " + circle.getArea());
		
	}
}
