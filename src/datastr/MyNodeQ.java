package datastr;

public class MyNodeQ<T> {
	
	private T element;
	private MyNodeQ<T> next = null;

	public MyNodeQ(T element) {
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
	public MyNodeQ<T> getNext() {
		return next;
	}
	public void setNext(MyNodeQ<T> next) {
		this.next = next;
	}
	
	@Override
	public String toString() {
		return element + "";
	}

}
