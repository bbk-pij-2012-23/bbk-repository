public class Guitar implements MusicalInstrument, WoodenObject {
	String name;	
	
	public Guitar(){
	}
	
	public void setName(String gName) {
		this.name = gName;
	}
	
	public void play(){
		System.out.println("...some music is being played");
	}
	public void burn(String name){
		System.out.println("Your " + name + " is on fire");
	}
	
	public static void main(String[] args) {
		MusicalInstrument guitar = new Guitar();
		guitar.play();
		WoodenObject guitar1 = new Guitar();
		guitar1.burn("Guitar");
	}
	
}	