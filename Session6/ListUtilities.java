public class ListUtilities {
	Node head = null;
	Node tail = null;
	int index;
	String type = "names";
/** method inFirst puts new elements @inFirstNode at the head of the list (like a stack). 
*/	
	
	public String getType(){
		return type;
	}
	
	public void launchInFirst(String type) {
		System.out.println("key in " + type + ", hitting enter after each. enter -1 when you have finished");
		while(true) {	
			System.out.println("> ");
			String str = System.console().readLine();
			if (str.equals("-1")){
				break;
			}
			Node first = new Node(str);
			inFirst(first);	
		}
	}	
	
	public void inFirst(Node inFirstNode){
		
		if (head == null){
			head = inFirstNode;
			tail = inFirstNode;
			index = 1;
		}
		
/** for top of list 1. point temp node at head, set its prev to node to add, s
set node to adds next to temp, then change top of list to node to add - see diagram in notes
*/
		else{ 
			Node temp = head;
			temp.prev = inFirstNode;
			inFirstNode.next = temp;
			head = inFirstNode;
			index++;
		}	
	}
/** method inLastNode places the most recent element @inLastNode at the tail of the list (like a queue)*/
	
	public void launchInLast(String type){
		System.out.println("key in " + type + ", hitting enter after each. enter -1 when you have finished");
		while(true) {	
			System.out.println(type + ": ");
			String str = System.console().readLine();
			if (str.equals("-1")){
				break;
			}	
			Node last = new Node(str);
			inLast(last);	
		}
	}
	
	public void inLast(Node inLastNode){
		if (head == null){
			head = inLastNode;
			tail = inLastNode;
			index = 1;
		}
		
		else {
			Node temp = tail;
			temp.next = inLastNode;
			inLastNode.prev = temp;
			tail = inLastNode;
			index++;
		}	
	}

	/** method inOptional asks the user at what position to add the element @atIndexNode by displaying total no. of elements on list and taking in int between 1 and index.
	To fix: ** no exit 
			** if a string cannot be parsed into int (ie it isn't a number) method crashes out. Currently thats the only way to exit inOptional
			** you cannot put an element at the end of the list (i.e. the list length is checked BEFORE new element added, so can't add it to the end because its longer that the list).
*/
	public void inOptional(Node atIndexNode){
		if (head == null){
			head = atIndexNode;
			tail = atIndexNode;
			index = 1;
		}
		else{
			System.out.println("there are " + index + " names in the list, where do you want to place this one?");
			System.out.println("enter number: ");
			String str = System.console().readLine();
			int no = Integer.parseInt(str);
			
			if (no == 1){
				inFirst(atIndexNode);
			}
			else if(no == index+1) {
				inLast(atIndexNode);
			}	
			else if (no > 1 && no <= index){
				Node temp = head;
				int counter = 1;
				while (counter < no) {
					temp = temp.next;
					counter++;
				}
				 /* put in the node at the position you want - in between temp and temp.prev
				 then update the old links between temp and temp.prev (temp.prev's next shouldn't be temp anymore, it should be atIndexNode; temp's prev should be temp.prev it should be atIndexNode */
				atIndexNode.next = temp;
				atIndexNode.prev = temp.prev;
				temp.prev.next = atIndexNode; //these will always be addedNode on the right because have to make old nodes point to it
				temp.prev = atIndexNode;
				index++;
			}	
			else if(no > index) {
				System.out.println("There aren't enough names in the list to place it there");
			}
			else {
				System.out.println("I can't do that");
			}
		}
	}	
/**	remove the element from the front of the list */
	public void outFirst(){
		head = head.next;
		head.next.prev = null;
		index--;
		
	}


	public void outLast(){
		tail = tail.prev;
		tail.prev.next = tail.prev;
		index--;
	}
	
	public void outOptional(){
		System.out.println("Do you want to specify the name or the position of the element?");
		System.out.println("Key in N for name or P for position");
/** add method to choose what to remove by content 
*/		String str = System.console().readLine();
			if (str.equals("N")){
				System.out.println("Enter the name");
				str = System.console().readLine();
				Node temp = head;
				while (!str.equals(temp.name)) {
					temp = temp.next;
				}
				temp.prev.next = temp.next;
				temp.prev = temp.next.prev;
				index--;
			}
/** add method to choose what to remove by position
at the moment the index depends on how items were added, e.g. if added to the front, the first element in the list is the last position.
*/				
			if (str.equals("P")) {
			System.out.println("there are " + index + " elements in the list. which position do you want to remove? (note: position depends on how the list was made)");
			str = System.console().readLine();
			int no = Integer.parseInt(str);
			
				if (no == 1){
					outFirst();
				}
				else if(no == index) {
					outLast();
				}	
				else if (no > 1 && no <= index){
					Node temp = head;
					int counter = 1;
					while (counter < no) {
						temp = temp.next;
						counter++;
					}
					temp.prev.next = temp.next;
					temp.prev = temp.next.prev;
					index--;	
				}
			}
		}
	public void reader(){
		System.out.println("printing list...");
		Node reader = head;
		while (reader != null) {
			System.out.println(reader.name);
			reader = reader.next;
		}
	}
	public void itemCount(String type){
		System.out.println("There are " + index + " " + type);
	}
	
	public void launch() { 
		System.out.println("would you like to add new names at the front of the list or at the back?");
		System.out.println("For front, key in F and hit Enter");
		System.out.println("for back, key in B and hit Enter");
		System.out.println("to choose a position, key in C and hit Enter");
		String str = System.console().readLine();
		getType();
		if (str.equals("F")) {
			launchInFirst(type);
		}
		else if (str.equals("B")){
			launchInLast(type);
		}
		else if (str.equals("C")){
			System.out.println("key in the " + type + " hitting enter after each. enter -1 when you have finished");
			while(true) {	
				System.out.println(type + ": ");
				str = System.console().readLine();
				if (str.equals("-1")){
					break;
				}
			Node optional = new Node(str);
			inOptional(optional);	
			} 
		}	
		else{
			System.out.println("that is not a valid option. Please try again.");
			launch();
		}
				
	}
	
	public void deleteLaunch(){
		System.out.println("Now remove a name from the list");
		System.out.println("Key in F to remove the first element, L to remove the last element or C to select the element to remove");
		String str = System.console().readLine();
		if (str.equals("F")) {
			outFirst();
		}
		if(str.equals("L")){
			outLast();
		}
		if(str.equals("C")){
			outOptional();
		}	
	}
	
	
	public static void main(String[] args){
		ListUtilities list = new ListUtilities();
		list.launch();
		list.reader();
		list.deleteLaunch();
		list.reader();
		
	/*	
		int[] theArray;
		theArray = new int[4];
		// int[] myArray = {123, 44, 55, 1}; resulted in error: unexpected token 123

		theArray[0] = 123;
		theArray[1] = 44;
		theArray[2] = 55;
		theArray[3] = 1;
	*/
	}
	
}