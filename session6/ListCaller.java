public class ListCaller {
	
	public ListCaller(){
	}
	
	public static void main(String[] args) {
		ListCaller launcher = new ListCaller();
		launcher.launch();
	}
	
	public void launch() {
		System.out.println("What sort of list do you want to make? Key in a number from the menu");
		System.out.println("1: Stack");
		System.out.println("2: Queue");
		System.out.println("3: sorted list");
		System.out.println("4: Custom list");
		String str = System.console().readLine();
		int choice = Integer.parseInt(str);
		if (choice == 1) {
			ListUtilities stack = new Stacks();
			stack.launch();
		}	
		if (choice == 2) {
			ListUtilities queue = new Queues();
			queue.launch();
		}
		
	/*
			List list = new List();
			list.launch();
	*/		
	}
}