package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_LinkedList;



public class MyLinkedListTest {
	public static void main(String[] args) {
		System.out.println("/=/=/=/= TESTING /=/=/=/=");

        System.out.println("LinkedList integer da nhap la: ");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);
        linkedList.addLast(14);
        linkedList.addLast(15);
        //thêm 4 vào vị trí 2
       linkedList.add(2,4);
       linkedList.printList();
       System.out.println("phần tử bị xóa : " + linkedList.remove(2));
       

        linkedList.printList();
        
        System.out.println("kiểm tra phần tử có giá trị 11 : " + linkedList.contains(11));
        System.out.println("kiểm tra  vị trí phần tử có giá trị 11 : " + linkedList.indexOf(11));
        System.out.println(linkedList.getLast());
        System.out.println(linkedList.getFirst());
        
        
        
        
	}
}
