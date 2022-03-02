
public class Nodo {
	
	private int data;
	private Nodo next;
	private Nodo previous;
	
	
	public Nodo(int data) {
		this.data=data;
	}


	public int getData() {
		return data;
	}


	public void setData(int data) {
		this.data = data;
	}


	public Nodo getNext() {
		return next!=null ?next :null;
	}


	public void setNext(Nodo next) {
		this.next = next;
	}


	public Nodo getPrevious() {
		return previous!=null ?previous :null;
	}


	public void setPrevious(Nodo previous) {
		this.previous = previous;
	}
	

}
