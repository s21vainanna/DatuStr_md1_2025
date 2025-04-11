package datastr;

public class MyNodeD<T> {
	
	private T element;
	private MyNodeD<T> next = null;
	
	public MyNodeD(T element) {
		this.element = element;
		this.next = null;
	}
	
	public T getElement() {
		return element;
	}
	public void setElement(T inputElement) {
		if(inputElement != null) {
			this.element = inputElement;
		}
		else {
			element = (T) new Object();
		}
	}
	public MyNodeD<T> getNext() {
		return next;
	}
	public void setNext(MyNodeD<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return element + "";
	}

}
