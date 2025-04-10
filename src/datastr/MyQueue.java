package datastr;

public class MyQueue<T> {
	
	private MyNodeQ<T> front; //reference uz rindas priekšējo mezglu
	private MyNodeQ<T> rear;  //reference uz rindas pēdējo mezglu
	private int length;// rindas lielums lielums
    
	public MyQueue() {
	    this.front = null;
	    this.rear = null;
	    this.length = 0;
	}

	public boolean isEmpty() {
        return front == null;
    }

    public int size() {
        return length;
    }

    //enqueue
    public void addToRear(T element) {
        
        MyNodeQ<T> newNode = new MyNodeQ<>(element);//Tiek izveidots jaunais mezgls ar elementa vērtību;
        
        if (isEmpty()) {//speciālais gadījums
            front = newNode;//pēc elementa pievienošanas gan front reference, gan rear reference norāda uz šo vienīgo mezglu.
        } else {
            rear.setNext(newNode);//Pēdējam mezglam jāuzstāda saite uz jaunu mezglu;
        }
        rear = newNode;//rear referenci nomainam uz jauno mezglu.
        length++;
    }
    
    //dequeue
    public T removeFromFront() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        
        // saistītās rindas gadījumā nepieciešams sākumā izveidot jaunu referenci, kas norāda uz dzēšamo jeb pirmo mezglu
        MyNodeQ<T> nodeToRemove = front;
        
        T element = nodeToRemove.getElement();
        // Tad front referenci pārbīdam uz to mezglu, uz kuru norāda esošais front mezgls; 
        front = front.getNext();
        length--;
        
        // ja tas bija pēdējais elements, kas tika izdzēsts, tad rear reference šājā gadījumā ir jāmaina uz null
        if (isEmpty()) {
            rear = null;
        }
        
        return element;
    }
    

    public void print() {
        MyNodeQ<T> current = front;
        while (current != null) {
            System.out.print(current + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public void makeEmpty() {
        front = null;
        rear = null;
        length = 0;
    }

    
}
