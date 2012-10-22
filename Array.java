public class Marks {
	//some class stuff
	
	public void calc();
		i = 0;
		do {
			String str = System.console().readLine();
			int mark = Integer.parseInt(str);
			int dist = 0;
			int pass = 0;
			int fail = 0;
			int inv = 0;
			if (mark >=0 && mark < 50) {
				fail++;
			}
			else if (mark > 49 && mark <70) {
				pass++;
			}
			else if (mark > 70 && <= 100) {
				dist++;
			}
			else {
				inv++;
			}
			i++;
		} (while !str.equals("-1"));
	
	
	System.out.println ("there were " + i + " marks");
	System.out.println (dist + " distinctions");
	System.out.println (passes + " passes");
	System.out.println (fail + " fails");
	System.out.println (inv + " were invalid results");
	
	
	
	