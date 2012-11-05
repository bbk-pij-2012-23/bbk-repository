public class Mammal extends Animal {

	public Mammal(String mamName){
		super(mamName);
	}
	
	public void giveBirth(){
		System.out.println("It is alive");
	}	
	
	//reproduce();
	
	public static void main(String[] args) {
	System.out.println("what mammal?");
	String str = System.console().readLine();
	Mammal mammal = new Mammal(str);
	mammal.reproduce();
	mammal.giveBirth();
	}

}	