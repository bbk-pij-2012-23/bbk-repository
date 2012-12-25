/*Lookups:
* I just could not make this generic, tried with ArrayList, it didn't work, need help.
*
* Typos:
* forgot final bracket
* 1 end of line;
*/

import java.util.*;

public class PushdownAutomata {
/* simulates a pushdown automaton checking a palindrome (see Fundamentals of Computing 
* 2012Ð13 (7) http://www.dcs.bbk.ac.uk/~michael/foc/foc.html (pg 10)
*/
	public boolean palindromePDA(int[] elements, boolean isEven){
		boolean isPalindrome;
		Stack<Integer> palindromePDA = new Stack<Integer>();
		for (int i = 0; i < elements.length/2; i++){ //go to mid point adding elements
			palindromePDA.push(elements[i]);
		}
		if(isEven){
			for (int i = (elements.length/2); i < elements.length; i++){
				if(elements[i]==palindromePDA.peek()){
					palindromePDA.pop();
				}
				else{
					isPalindrome = false;
				}
			}
		}
		else{
			for (int i = (elements.length/2)+1; i < elements.length; i++){
				if(elements[i]==palindromePDA.peek()){
					palindromePDA.pop();
				}
				else{
					isPalindrome = false;
				}
			}
		}
		
		if(palindromePDA.empty()){//what if nothing was ever added?
			isPalindrome = true;
		}
		else {
			isPalindrome = false;
		}	
		
		return isPalindrome;
	}
	
	public void launch(){
		
		System.out.println("key in some numbers, separated by space, then hit enter");
		String str = System.console().readLine();
		String[] arrayStr = str.split(" ");
		int[] numbers = new int[arrayStr.length];
		for(int i = 0; i< arrayStr.length; i++){
			numbers[i] = Integer.parseInt(arrayStr[i]);
		}
		boolean isEven = false;
		if (numbers.length%2 == 0){
			isEven = true;
		}
		
			
		System.out.println(palindromePDA(numbers, isEven));
		
	}	
		
	
	public static void main(String[] args){
		PushdownAutomata run = new PushdownAutomata();
		run.launch();
	}	
}	
			
		
