package ss11_stack_queue.thuc_hanh.stack_voi_LinkedList;
import java.util.LinkedList;
public class MyGenericStack<T> {
	private LinkedList <T> stack;
	public MyGenericStack() {
        stack = new LinkedList();
    }
	
	public void push(T element) {
	    stack.addLast(element);
	}
	
	public T pop() {
	    if (isEmpty()) {
	       System.out.println("Không có phần tử nào");
	    }
	    return stack.removeLast();
	}
	
	public int size() {
	    return stack.size();
	}
	
	public boolean isEmpty() {
	    if (stack.size() == 0) {
	        return true;
	    }
	    return false;
	}
	
	
	
	
}
