/* Sort doesn't work, but seems to take generic type ok.
*/

public class SortedList {
	Node<Integer> head = null;
	String type = "numbers";
	
	public String getType(){
		return type;
	}	

	public void launchAdd() {
		getType();
		System.out.println("key in " + type + ", hitting enter after each. enter -1 when you have finished");
		while(true) {	
			System.out.println("> ");
			String str = System.console().readLine();
			if (str.equals("-1")){
				break;
			}
			int name = Integer.parseInt(str);
			Node<Integer> first = new Node<Integer>(name);
			add(first);	
		}
	}
	
	public void add(Node<Integer> newInt){
		if (head == null){
			head = newInt;
		}
		else{
			Node<Integer> temp = head;
			while(newInt.name > temp.name){
				temp = temp.next;
			}
			newInt.prev = temp;
			newInt.next = temp.next;
			temp.next.prev = newInt;
			temp.next = newInt;
		}
	}

	public void listNodes(){
		System.out.println("printing list...");
		Node<Integer> reader = head;
		while (reader != null) {
			System.out.println(reader.name);
			reader = reader.next;
		}
	}	
	
	public static void main(String[] args){
		SortedList sr = new SortedList();
		sr.launchAdd();
	}	
		
	/*
	public void remove(){
		retrieve();
	}
	*/
}
