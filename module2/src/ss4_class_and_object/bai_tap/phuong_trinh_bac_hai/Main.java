package ss4_class_and_object.bai_tap.phuong_trinh_bac_hai;

import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		double a,b,c;
		Scanner sc= new Scanner(System.in);
		System.out.print("a=" );
		a = sc.nextDouble();
		System.out.print("b=" );
		b = sc.nextDouble();
		System.out.print("c=" );
		c = sc.nextDouble();
		
		QuadraticEquation quadratic = new QuadraticEquation(a,b,c);
		
		if(a ==0 ) System.out.println("nghiệm của phương trình " + -c/b);
		else {
			double delta = quadratic.getDiscriminant();
			if(delta > 0) {
				System.out.println("Nghiệm x1 = " + quadratic.getRoot1(delta));
				System.out.println("Nghiệm x2 = " + quadratic.getRoot2(delta));
			}else if(delta < 0) System.out.println("The equation has no roots");
			else System.out.println("Nghiệm x1 = x2 = " + quadratic.getRoot1(delta));
		}
		
	}
}
