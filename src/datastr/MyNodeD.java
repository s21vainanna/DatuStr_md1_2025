package datastr;

public class MyNodeD<T> {
	
	private T element;
	private MyNodeD<T> next = null;
	private MyNodeD<T> prev = null;
	
	public MyNodeD(T element) {
		this.element = element;
		this.next = null;
		this.prev = null;
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
	
	public MyNodeD<T> getPrev() {
		return prev;
	}

	public void setPrev(MyNodeD<T> prev) {
		this.prev = prev;
	}

	@Override
	public String toString() {
		return element + "";
	}

}
