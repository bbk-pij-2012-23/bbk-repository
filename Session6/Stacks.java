public class Stacks extends ListUtilities{
	Node head = null;
/** Stacks are First in First out lists so push will call inFirst and pop will call outFirst
*/	
	public void push() {
		String type = "items";
		launchInFirst(type);
		reader();
		launch();
	}
	
	public void pop() {
		if(empty() == true) {
			System.out.println("you need to add items first");
			push();
		}
		else {
			outFirst();
			reader();
			launch();
		}	
	}
	
	public boolean empty() {
		if (head != null){
			return false;
		}
		else {
			return true;
		}	
	}
	
	public void launch(){
		System.out.println("push or pop? (q to quit)");
		String str = System.console().readLine();
		if (str.equals("push")){
			push();
		}
		else if (str.equals("pop")){
			pop();
		}
		else if (str.equals("q")){
			while (str.equals("q")){
				break;
			}
		}
		else {
			System.out.println("that is not a valid option. Type 'push' or type 'pop' if you don't know what they do, google 'java stacks'.");
		}
	}
	
	public static void main(String[] args) {
	
	}
}