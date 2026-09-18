package ListaCircularDupla.models;

public class DoublyCircleList<T> {
	
	private Node<T> head;
	private Node<T> tail;
	private int size = 0;
	
	public DoublyCircleList(){}

	//getters e setters
	
	public Node<T> getHead() {
		return head;
	}

	public void setHead(Node<T> head) {
		this.head = head;
	}

	public Node<T> getTail() {
		return tail;
	}

	public void setTail(Node<T> tail) {
		this.tail = tail;
	}
	
	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
	
	//methods
	public void append(T value) {
		Node<T> newNode = new Node(value);
		
		if(head == null) {
			this.head = newNode;
			this.tail = newNode;
			
			newNode.setNext(newNode);
			newNode.setPrev(newNode);
		}else{
			newNode.setPrev(tail);
			newNode.setNext(head);
			
			tail.setNext(newNode);
			head.setPrev(newNode);
			
			tail = newNode;
		}
		
		size++;
	}
	
	public T ler() {
		
	    if (head == null) {
	        return null;
	    }

	    Pagina pagina = (Pagina) head.getValue();

	    if (size == 1) {
	        head = null;
	        tail = null;
	    } else {	
	        head = head.getNext();

	        head.setPrev(tail);
	        tail.setNext(head);
	    }

	    size--;

	    return (T) pagina;
		
	}
	
	
	
	
	public void incrementSize() {
		this.size++;
	}

}
