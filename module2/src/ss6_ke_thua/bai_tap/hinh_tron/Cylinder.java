package ss6_ke_thua.bai_tap.hinh_tron;

public class Cylinder extends Circle {
	private double high;

	public Cylinder() {
	}

	public Cylinder(double radius, String color,double high) {
		super(radius, color);
		this.high = high;
	}
	
	

	public double getHigh() {
		return high;
	}

	

	public void setHigh(double high) {
		this.high = high;
	}

	@Override
	public String toString() {
		return "Cylinder : high=" + high + ",radius " + this.radius + ",color :" + this.color;
	}
	
	public double getCapacity() {
		return this.getArea()*this.high;
				
	}
	
	
	
	
	
}
