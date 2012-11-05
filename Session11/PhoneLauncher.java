public class PhoneLauncher {
	
	public PhoneLauncher(){
	}
	
	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}
	
	public void launch() {
		SmartPhone sm = new SmartPhone("075123456789");
		System.out.println("enter web address");
		String address = System.console().readLine();
		sm.browseWeb(address);  //SmartPhone methods
		sm.findPosition();		//SmartPhone methods
		sm.call("3456789");		//OldPhone method overridden by MobilePhone method  (since overridden by SmartPhone method)
		sm.call("12345");		// 
		sm.call("004524524");	// Demonstrates a new overridden method in SmartPhone
		sm.call("045789");		// 
		sm.printLastNumbers();	// MobilePhone method
		System.out.println("what game do you want to play?");
		String game = System.console().readLine();
		sm.playGame(game);
		
		
	
	}
}