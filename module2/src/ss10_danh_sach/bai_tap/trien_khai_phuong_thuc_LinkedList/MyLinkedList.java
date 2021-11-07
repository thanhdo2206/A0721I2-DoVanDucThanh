package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_LinkedList;



public class MyLinkedList<E> {
	private Node head;
	private int numNodes = 0;

	public MyLinkedList() {
	}

	public MyLinkedList(E element) {
		head = new Node(element);
	}

	public void add(int index, E element) {
		Node nodeTemp = head;

		int count = 0;
		while (nodeTemp != null) {
			nodeTemp = nodeTemp.next;
			count++;

			if (count == index - 1) {
				Node nodeElement = new Node(element);
				nodeElement.next = nodeTemp.next;
				nodeTemp.next = nodeElement;
				break;
			}

		}
		numNodes++;
	}

	public void addFirst(E element) {
		Node nodeElement = new Node(element);
		nodeElement.next = head;
		head = nodeElement;
		numNodes++;
	}

	public void addLast(E element) {

		Node nodeTemp = head;

		while (nodeTemp != null) {

			if (nodeTemp.next == null) {
				nodeTemp.next = new Node(element);
				break;
			}

			nodeTemp = nodeTemp.next;

		}

		numNodes++;
	}

	public E remove(int index) {
		Node nodeTemp = head;
		for (int i = 0; i < index - 1 && nodeTemp.next != null; i++) {
			nodeTemp = nodeTemp.next;
		}

		Node nodeRemove = nodeTemp.next;
		nodeTemp.next = nodeTemp.next.next;
		numNodes--;
		return (E) nodeRemove.getData();
	}

	public int size() {
		return numNodes;
	}
	
	public boolean contains(E o) {
		Node nodeTemp = head;

		while (nodeTemp != null) {

			if (nodeTemp.getData() == o) {
				return true;
			}

			nodeTemp = nodeTemp.next;

		}
		return false;
	}
	
	public int indexOf(E o) {
		
		Node nodeTemp = head;
		int index = 0;
		while (nodeTemp != null) {

			if (nodeTemp.getData() == o) {
				return index;
			}

			nodeTemp = nodeTemp.next;
			index++;

		}
		return -1;
	}
	
	public E get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return (E) temp.getData();
    }
	
	public E getLast() {
		Node temp = head;
		for(int i=0;i<numNodes-1;i++) {
			 temp = temp.next;
		}
		
        return (E) temp.getData();
	}
	
	public E getFirst() {
		return (E) head.getData();
	}


	public void printList() {
		Node temp = head;
		while (temp != null) {
			System.out.println(temp.getData());
			temp = temp.next;
		}
	}
	
	public void clear() {
		head = null;
		numNodes =0;
	}

	private class Node {
		private Object data;
		private Node next;

		public Node(Object data) {
			this.data = data;
		}

		public Object getData() {
			return this.data;
		}
	}

}
