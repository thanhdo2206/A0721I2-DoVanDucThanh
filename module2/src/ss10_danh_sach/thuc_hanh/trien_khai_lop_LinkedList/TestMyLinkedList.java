package ss10_danh_sach.thuc_hanh.trien_khai_lop_LinkedList;



public class TestMyLinkedList {
	public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");

        System.out.println("LinkedList integer da nhap la: ");
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.addFirst(11);
        linkedList.addFirst(12);
        linkedList.addFirst(13);

        linkedList.add(4,9);
        linkedList.add(4,9);
        linkedList.printList();
    }
}
