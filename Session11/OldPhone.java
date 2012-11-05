public class OldPhone implements Phone{
	private String myNumber;
	
	public OldPhone(String myNewNumber){
		this.myNumber = myNewNumber;
	}
	
	
	public String getNumber() {
		return myNumber;
	}
	
	public void call(String numberToCall) {
		System.out.println("Calling..." + numberToCall);
	}
	
	
	public static void main(String[] args) {
		Phone phone = new OldPhone("020 7232 2934");
		phone.call("020 7232 1234");
	}
}