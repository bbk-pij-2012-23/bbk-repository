public class Queues extends Stacks{
		Node head = null;
		private String type = "items"; 
		
/** Queues are Last in first out (i.e. element added to the end/back of the list and removed from the front of the list)
It will use ListUtilities methods through inheritance via Stacks
*/
		public String getType() {
			return type;
		}	
		
		public void insert() { 
			getType();
			launchInLast(type);
			reader();
			size();
			launch();
		}	
		
		public void retrieve() {
			if(size() == 0) {
				System.out.println("you need to add items first");
				insert();
			}
			else {
				outLast();
				reader();
				size();
				launch();
			}	
		}
		
		public int size() {
			getType();
			itemCount(type);
			return index;
		}
		
		public void launch() {
			System.out.println("add or remove elements from the queue? (q to quit)");
			String str = System.console().readLine();
			if (str.equals("add")){
				insert();
			}
			else if (str.equals("remove")){
				retrieve();
			}
			else if (str.equals("q")){
				while (str.equals("q")){
					break;
				}
			}
			else {
				System.out.println("that is not a valid option. Type 'add' or type 'retrieve' or 'q'.");
			}
			
		} 	
	}	