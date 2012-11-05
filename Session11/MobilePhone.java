public class MobilePhone extends OldPhone {
	private String[] lastCalls; //does it also have private string number? only if public or protected
	
	public MobilePhone(String myMobNumber){
		super(myMobNumber);
		lastCalls = new String[10];
	}
	
	public void setLastCalls(String[] lastcalls){
		this.lastCalls = lastCalls;
	}	
	
	
	/** dummy methods that can be called
	*/
	
	public void ringAlarm(String wakeTime) {
		System.out.println("I'll wake you at " + wakeTime);
	}
	
	public void playGame(String gameName) {
		System.out.println("You are playing a game, its called " + gameName);
	}
	
	
	public void printLastNumbers() { //doesn't do a FIFO thing yet
		
		int i = 0;
		while(i<10){
			if (this.lastCalls[i] != null){
				System.out.println(this.lastCalls[i]);
				i++;
			}
			else{
				break;
			}	
		}	
	}	
		
	@Override
	public void call(String numberToCall) { //need to add the FIFO function
		System.out.println("Calling..." + numberToCall);
		int i = 0;
		while (i < 10) {
			if(this.lastCalls[i] != null) {
				i++;
			}
			else {
				this.lastCalls[i] = numberToCall;
				break;
					
			}
		}	
		
	}

	
	public static void main(String[] args){
		MobilePhone mp = new MobilePhone("07524567");
		System.out.println(mp.getNumber());
		mp.call("1234565");
		mp.call("345123");
		mp.printLastNumbers();
		System.out.println("what time do you want to get up?");
		String time = System.console().readLine();
		mp.ringAlarm(time);
		System.out.println("what game do you want to play?");
		String game = System.console().readLine();
		mp.playGame(game);
		
	}	
			
	
}