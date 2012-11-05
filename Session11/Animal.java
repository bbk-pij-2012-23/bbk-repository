public class Animal {
	String name;
	
	public Animal(String thisName) {
		this.name = thisName;
	}
	
	public String getName(){
		return name;
	}
	
	public void call(String animalName){
		System.out.println(animalName + "coming...");
	}
	
	public void reproduce(){
		Animal newAnimal = new Animal(name);
		newAnimal.getName();
		System.out.println("you have new " + newAnimal.name + "(s)");
	}
	
	public void whatAnimal() {
		System.out.println("what animal?");
		String str = System.console().readLine();
	}	
}