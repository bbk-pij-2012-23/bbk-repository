public class OldPhone implements Phone{
	private String myNumber;
	private String brand = null;
	
	
	public OldPhone(String myNewNumber){
		this.myNumber = myNewNumber;
	}
/** the constructor OldPhone(String myBrand) is for exercise 3 but I already did the same task using OldPhone(myNewNumber). see too MobilePhone use of getNumber
*/	
/*	public OldPhone(String myBrand) {
		this.brand = myBrand;
	}
*/	
	public String getBrand(){
		return brand;
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