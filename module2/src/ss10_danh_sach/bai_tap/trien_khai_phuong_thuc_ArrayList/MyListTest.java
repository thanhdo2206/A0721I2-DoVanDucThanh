package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_ArrayList;


public class MyListTest {
	 public static void main(String[] args) {
	        MyList<Integer> arrayList = new MyList<>();
	        arrayList.add(2);
	        arrayList.add(6);
	        arrayList.add(9);
	        arrayList.addIndex(8,1);
	        arrayList.add(10);
	        arrayList.addIndex(11,5);
	        
	        System.out.println("Danh sach integer da nhap la: ");
	        for (int i = 0; i < arrayList.size(); i++) {
	            System.out.print(arrayList.get(i) + ",");
	        }
	        System.out.println("\n---------------------------");
	        
	        //kiểm tra chứa phần tử
	        System.out.println(arrayList.contains(6));
	        
	        //xóa phần tử
	        System.out.println("Phần tử bị xóa là : " + arrayList.remove(2));
	        System.out.println("Danh sach sau khi xoa la: ");
	        for (int i = 0; i < arrayList.size(); i++) {
	            System.out.print(arrayList.get(i) + ",");
	        }
	        System.out.println("");
	        
	      //tìm vị trí phần tử
	        System.out.println(arrayList.indexOf(8));
	       
	        MyList<Integer> newArrayList = new MyList<>();
	        newArrayList = arrayList.clone();
	        System.out.println("Danh sach clone la: ");
	        for (int i = 0; i < newArrayList.size(); i++) {
	            System.out.print(newArrayList.get(i) + ",");
	        }
	        System.out.println("");
	      
	        
	       
	    }
}
