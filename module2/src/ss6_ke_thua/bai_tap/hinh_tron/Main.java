package ss6_ke_thua.bai_tap.hinh_tron;

public class Main {
	public static void main(String[] args) {
		Circle circle = new Circle(2,"yellow");
		Cylinder cylinder = new Cylinder(2,"blue",5);
		System.out.println("Area : " + circle.getArea());
		System.out.println("Area : " + cylinder.getArea() );
		System.out.println("Capacity : " + cylinder.getCapacity() );
		System.out.println(circle);
		System.out.println(cylinder);
		
				
	}
}
