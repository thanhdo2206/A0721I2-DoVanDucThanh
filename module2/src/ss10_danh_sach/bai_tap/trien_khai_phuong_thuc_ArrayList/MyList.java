package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_ArrayList;

public class MyList<E> {
	private int size = 0;
	static final int DEFAULT_CAPACITY = 10;
	private Object[] elements;

	public MyList() {

	}

	public MyList(int size, Object[] elements) {
	
		this.size = size;
		this.elements = elements;
	}

}
