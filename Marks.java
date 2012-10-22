public class Marks {
	//D6 exercise in the notes.
	
	public void calc() {
		int i = 0;
		int dist = 0;
		int pass = 0;
		int fail = 0;
		int inv = 0;
		String str = "";
		do {
			str = System.console().readLine();
			int mark = Integer.parseInt(str);
			
			if (mark >=0 && mark < 50) {
				fail++;
			}
			else if (mark > 49 && mark <70) {
				pass++;
			}
			else if (mark > 70 && mark <= 100) {
				dist++;
			}
			else {
				inv++;
			}
			i++;
		} while (!str.equals("-1"));
		System.out.println ("there were " + i + " marks");
		System.out.println (dist + " distinctions");
		System.out.println (pass + " passes");
		System.out.println (fail + " fails");
		System.out.println (inv + " were invalid results");
	}
	
	public static void main(String[] args) {
		System.out.println ("key each mark then hit enter. When you have finished key in -1");
		Marks myCalc = new Marks();
		myCalc.calc();
		
	
	}	

}	
	