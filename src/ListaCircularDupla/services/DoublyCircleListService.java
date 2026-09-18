package ListaCircularDupla.services;

import ListaCircularDupla.entities.DoublyCircleList;
import ListaCircularDupla.entities.Node;

public class DoublyCircleListService<T> {
	
	public DoublyCircleList<T> createDoublyCircleList(){
		DoublyCircleList<T> doublyCircleList = new DoublyCircleList<>();
		return doublyCircleList;
	};


	public void append(DoublyCircleList list, T value) {
		
		Node<T> newNode = new Node(value);
		Node<T> head = list.getHead();
		Node<T> tail = list.getTail();
		
		if(head == null) {
			head = newNode;
			tail = new Node();
				
			head.setNext(tail);
			head.setPrev(tail);
		
			tail.setNext(head);
			tail.setPrev(head);
		}else if(tail == null) {
			newNode.setNext(head);
			tail = newNode;
		}
		
	}
	
}
