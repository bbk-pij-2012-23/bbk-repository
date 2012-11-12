public class Node<T>{
	T name;
	Node<T> prev;
	Node<T> next;
	
	public Node(T name){
		this.name = name;
	}
}
