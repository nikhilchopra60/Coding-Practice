package Imp;


public class LinkedListStack<T> {

	class Node<T>{
		
		T data;
		Node<T> next;
		
		public Node(T data, Node<T> next){
			this.data = data;
			this.next = next;
		}
		
	}
	
	Node top;
	
	public void push(T item){
		
		Node<T> current = new Node<T>(item, top.next);
		current = top; // TOP will now point to curr. Just like add first method of linkedlist
		
	}
	
	public T pop(){
		
		if(top==null){
			System.out.println("Stack is Empty. Cannot pop.");
			return null;
		}
		
		top = top.next;
		
		return (T)top.data;
		
		
	}
	
}
