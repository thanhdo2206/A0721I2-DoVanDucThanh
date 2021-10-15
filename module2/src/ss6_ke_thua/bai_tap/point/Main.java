package ss6_ke_thua.bai_tap.point;

public class Main {
	public static void main(String[] args) {
		System.out.println("Tọa độ 2D:");
		Point2D point2D = new Point2D(2,4);
		System.out.println(point2D);
		point2D.setXY(8,6);
		System.out.println(point2D);
//		float[] arr = point2D.getXY() ;
//		for(int i=0;i<arr.length;i++) {
//			System.out.print(arr[i]+" ");
//		}
		
		
		System.out.println("\nTọa độ 3D:");
		Point3D point3D = new Point3D(-1, 8, 10);
		System.out.println(point3D);
		point3D.setXYZ(9,10,-5);
		
		float[] arr = point3D.getXYZ() ;
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		
		
	}
}	
