package ss1_introduction_to_java.thuc_hanh;
import java.util.Scanner;

public class Operator {
	public static void main(String[] args) {
        float width;
        float height;

        Scanner scanner = new Scanner(System.in);//Khai báo đối tượng Scanner

        System.out.println("Enter width: ");
        width = Float.parseFloat(scanner.nextLine());    //Nhập chiều rộng
        
        System.out.println("Enter height: ");
        height = scanner.nextFloat();//Nhập chiều dài
        float area = width * height;

        System.out.println("Area is: " + area);
	}
}
