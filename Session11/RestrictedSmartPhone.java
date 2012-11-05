public class RestrictedSmartPhone extends SmartPhone {

	public RestrictedSmartPhone(String myRSPNumber){
		super(myRSPNumber);
	}

	@Override
	private void playGame(String gameName) {
		System.out.println("You are playing a game, its called " + gameName);
	}
	
	public static void main(String[] args) {
		RestrictedSmartPhone rsp = new RestrictedSmartPhone("01245");
		System.out.println("what game do you want to play?");
		String game = System.console().readLine();
		rsp.playGame(game);
	}	
}
