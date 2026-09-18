package ListaCircularDupla.entities;

public class DoublyCircleList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	
	public DoublyCircleList(){}
	
	//methods
	
	//append
	public void append(T value) {
		
		Node<T> newNode = new Node(value);
		
		if(head == null) {
			this.head = newNode;
			this.head.setNext(tail);
			this.head.setPrev(tail);
		}else if(tail == null) {
			
		}
		
	}
	

}
