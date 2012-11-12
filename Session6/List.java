public class List<T> {
	Node<T> head = null;
	Node<T> tail = null;
	Node<T> next = null;
	Node<T> prev = null;
	
	public List() {

	}
    
    public Node<T> getHead() {
        return head;
    }
    
    public Node<T> getNext () {
        return next;
    }
    
    public Node<T> getPrev(){
        return prev;
    }
    
	public void addNode(Node<T> newNode) { 
		
		if(head == null){
			head = newNode;
			tail = newNode;
		}
		
		else{
			Node<T> temp = tail; 
			temp.next = newNode; //this is where the link to next patient is
			newNode.prev = temp; //this is the link to the previous patient
			tail = newNode;	
		}
			
	}	
/*	
	public void launch() {
		System.out.println("key in names, hitting enter after each. enter -1 when you have finished entering names");
		while(true) {	
			System.out.println("name: ");
			String str = System.console().readLine();
			if (str.equals("-1")){
				break;
			}
				
			Node first = new Node(str);
				addNode(first);
			 
		}
			
		System.out.println("head is " + head.name + ", tail is " + tail.name);
	} 	
*/
}

	
	
/*
	public static void main(String[] args) {
		List List = new List();
		List.launch();
	}
*/

	
	