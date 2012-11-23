public class QueueClass {
		Node head = null;
		Node tail = null;
		int index;
		
		public void insert(Node newNode) { 
			if(head == null){
				head = newNode;
				tail = newNode;
				index = 1;
			
			}
			else{
				Node temp = head; 
				temp.prev = newNode; //this is where the link to prev patient is
				newNode.next = temp;//this is the link to the next patient
				head = newNode;
				index++;
				System.out.println("head is now " + head.name + ", next is " + head.next.name + ", tail"
					+ " is " + tail.name);
					
			}
			
		}	
		
		public int size(){
			System.out.println("there are " + index + " in the queue");
			return index;
		}
		
		public void retrieve(){
			Node temp = tail.prev;
			tail = temp;
			temp.next = null;
			System.out.println("tail is now " + tail.name + ", and previous is " + tail.prev.name);
			index--;
		}	
		
		public void reader(){
			Node reader = head;
			while (reader != null) {
				System.out.println(reader.name);
				reader = reader.next;
			}
		}	
			
		public static void main(String[] args) {
			QueueClass q = new QueueClass();
			q.launch();
			q.reader();
			q.size();
			q.retrieve();
			q.reader();
			q.size();
			q.retrieve();
			q.retrieve();
			q.reader();
			q.size();
			q.launch();
			q.reader();
			
		}

		public void launch() {
			System.out.println("key in names, hitting enter after each. enter -1 when you have finished entering names");
			while(true) {	
				System.out.println("name: ");
				String str = System.console().readLine();
				if (str.equals("-1")){
					break;
				}
				
			Node first = new Node(str);
				insert(first);	
			}
				
		}
				
		 	
}	