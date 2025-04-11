package datastr;

public class MyDeque<T> extends MyQueue<T> {

	@Override
	public void addToRear(T element) {
		super.addToRear(element);
	}

	@Override
	public T removeFromFront() {
		return super.removeFromFront();
	}

	public void addToFront(T element) {
		MyNodeQ<T> newNode = new MyNodeQ<>(element);// Tiek izveidots jaunais mezgls ar elementa vērtību;

		if (isEmpty()) {
			front = newNode;
			rear = newNode;
		} else {
			front.setPrev(newNode);
			newNode.setNext(front);// pirmajam mezglam jāuzstāda saite uz jauno mezglu
			front = newNode;// front referenci nomaina uz jauno mezglu
		}
		length++;

	}

	public T removeFromRear() {
		if (isEmpty()) {
			throw new RuntimeException("Deque is empty");
		}

		T element = rear.getElement();// elements, kas tiks izdzēsts

		// speciāls gadījums
		if (rear == front) {
			front = null;
			rear = null;
		} else {
			// tad rear referenci pārbīdām uz to mezglu, uz kuru norāda esošais rear mezgls
			rear = rear.getPrev();
			// saite uz nākamo elementu būs ar referenci null, jo tāds nākamais elements neeksistē
			rear.setNext(null);
		}
		
		length--;
		return element;
	}

}
