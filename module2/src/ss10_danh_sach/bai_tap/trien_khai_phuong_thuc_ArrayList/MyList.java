package ss10_danh_sach.bai_tap.trien_khai_phuong_thuc_ArrayList;

import java.util.Arrays;

public class MyList<T> {
	private int size = 0;
	private final int DEFAULT_CAPACITY = 10;
	private T[] elements;
	private int[] nums = new int[10];

	public MyList() {
		elements = (T[]) new Object[DEFAULT_CAPACITY];
	}

	public MyList(int capacity) {
		elements = (T[]) new Object[capacity];

	}


	public void add(T element) {
		if (size == elements.length) {
			ensureCapacity();
		}
		// Thêm phần tử element vào cuối danh sách (mảng)
		elements[size] = element;
		
		size++;
	}

	public void addIndex(T element, int index) {
		if (size == elements.length) {
			ensureCapacity();
		}

		T[] arrTemp = (T[]) new Object[size ];
		
		int lengthCopy = (size - (index + 1)) + 1;
		
		System.arraycopy(elements, index, arrTemp, 0, lengthCopy);
		
		
		elements[index] = element;
		System.arraycopy(arrTemp, 0, elements, index + 1, lengthCopy);
		
		
		size++;
	}
	
	public T remove(int index) {
		T elementDelete = elements[index];
		T[] arrTemp = (T[]) new Object[size - 1];
		int lengthCopy = (size - (index + 1));
		System.arraycopy(elements, index + 1, arrTemp, 0, lengthCopy);
		System.arraycopy(arrTemp, 0, elements, index , lengthCopy);
		elements[size-1] = null;
		size--;
		return elementDelete;
		
	}

	public int size() {
		return size;
	}
	
	public MyList<T> clone() {
		 MyList<T> temp = new MyList<>();
		 temp.elements = Arrays.copyOf(this.elements, this.size);
		 temp.size = this.size;
		return temp;
	}
	
	public boolean contains(T other) {
		for(T element : elements) {
			if(element == other) return true;
		}
		return false;
	}

	public int indexOf(T other) {
		for(int i=0;i< elements.length ;i++) {
			if(elements[i] == other) return i;
		}
		return -1;
	}
	
	public void ensureCapacity() {
		int newSize = elements.length * 2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public T get(int i) {
		if (i >= 0 && i <= size) {
			return elements[i];
		}
		throw new IndexOutOfBoundsException("Index: " + i + ", Size " + (size - 1));
	}
	
	public void clear() {
		for(T element: elements) {
			element = null;
		}
		
		size = 0;
	}

}
