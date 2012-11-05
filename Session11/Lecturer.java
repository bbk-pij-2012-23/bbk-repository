// Lecturer.java
/**
* A lecturer has both teaching and research responsibilities
*/
public class Lecturer extends Teacher { 

/*this doesn't compile because java makes a constructor
public Lecturer(){
}
but Teacher is constructed with public Teacher(String name)...
constructors don't extend.
	
this should sort it:
*/
	public Lecturer(String name){
		super(name);
	}	

	public void doResearch(String topic) {
		System.out.println("Doing research on: " + topic);
	}
	
	public static void main(String[] args) {
		Lecturer bob = new Lecturer("Bob");
		bob.teach("maths");
		bob.doResearch("garbage collection methods");
	}
}