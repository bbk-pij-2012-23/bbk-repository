public class Calculator {
	
	
	public void calc(int a, int b, String operator){
		if (operator.equals("+")){
			int sum = a + b;
		}
		
		else if (operator.equals("-")){
			int subtract = a - b;
			
		}
		else if (operator.equals("*")){
			int multiply = a * b;
				
		}
		else if (operator.equals("/")){
			int divide = a / b; 
			int mod = a % b;
		}
		else {
			String error = "I don't recognise that";
		}	
		
		
	}	
		
}
 