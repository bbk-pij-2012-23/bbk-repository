public class UsefulMethods {


/** uses ASCII table to look up character to check whether @str is number
*/
	public boolean findNum1(String str) {
		if (str.charAt(0) > (char)47 && str.charAt(0) < (char)58) {
			return true;
		}
		return false;
	}

	/*if findnum1=true, stringcharat0 = start */
	
	public void findNum(String str) {
		if (str.charAt(0) > (char)47 && str.charAt(0) < (char)58) {
			char start = str.charAt(0);
			System.out.println(start);
		}
		
	}
	
	public void dataClean(String str){
		str = str.replaceAll(" ","");
		System.out.println(str);
		int i = 0;
		Calculator calculate = new Calculator();
			while (i < str.length()) {
				if (str.substring(i,i+1).equals("/")) {
					String op = "/";
					int num1 = Integer.parseInt(str.substring(0,i-1));
					int num2 = Integer.parseInt(str.substring(i+1, str.length()-1));
					calculate.calc(num1, num2, op);
				}
				else if (str.substring(i,i+1).equals("*")){
					String op = "*";
					int num1 = Integer.parseInt(str.substring(0,i-1));
					int num2 = Integer.parseInt(str.substring(i+1, str.length()-1));
					calculate.calc(num1, num2, op);
				}
				else if(str.substring(i,i+1).equals("+")){
					String op = "+";
					int num1 = Integer.parseInt(str.substring(0,i-1));
					int num2 = Integer.parseInt(str.substring(i+1, str.length()-1));
					calculate.calc(num1, num2, op);
				}
				else if (str.substring(i,i+1).equals("-")) {
					String op = "-";
					int num1 = Integer.parseInt(str.substring(0,i-1));
					int num2 = Integer.parseInt(str.substring(i+1, str.length()-1));
					calculate.calc(num1, num2, op);
				}	
				
				else {
					i++;
				}	
		
			}
	}		
		
		
	

	public boolean isInteger(String str) {
		try {
			Integer.parseInt(str);
			return true;
		} catch (NumberFormatException nfe) {}
		return false;
	}	
		
}
