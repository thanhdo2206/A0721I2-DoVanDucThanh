package ss5_access_modifier_and_static.bai_tap.student;

public class Test {
	public static void main(String[] args) {
		Student student1 = new Student();
		System.out.println("Name : "  +student1.getName());
		student1.setName("Thanh");
		System.out.println("Name : "  +student1.getName());
	}
	
	
}
