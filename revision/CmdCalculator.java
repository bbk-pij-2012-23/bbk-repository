public class CmdCalculator {

	
	
	public static void main(String[] args) {
	
		System.out.println("no: ");
		String str = System.console().readLine();
		UsefulMethods calc = new UsefulMethods();
		calc.findNum(str);
		
		
	
	}	
	
}
