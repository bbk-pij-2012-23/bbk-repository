public class StringMethodsCaller {
/* This was tricky. Idea was to take a letter see if it is in the array if yes exit if no add it to the array and call count method
* however 
* i) couldn't check an empty array - added first run, then added the while loop.
* ii) couldn't exit method from a deep nested if (letter is in array) - did a boolean loop
* iii) when letter found in array could reach end of method because array node not null so entered endless loop - added other unnecc j++ to find a null j
* iv) then couldn't stop it playing out full method, counting instances of repeated letter - did a cop out println
*
* can't help but think I should have used a different approach...
* the do while loop solved everything very quickly (except the end before displaying)
*/
	public void checkLetter(String str){
		String prevLetters[] = new String[26];
		int i = 0;
		boolean isThere = false;
		do { 
			System.out.println("Enter a letter, if you repeat a letter the programme will end");
			String substr = System.console().readLine();
			int j = 0;
			while (prevLetters[j]!=null){
				if (substr.equals(prevLetters[j])){
					isThere = true;
					j++;
					//System.out.println("j = " + j);
					System.out.println("I'm going to end now because AS YOU ALREADY KNOW");
				}
				else{
					//System.out.println("J = " + j);
					j++;
				}
			}
			StringCounter lettercount = new StringCounter();
			System.out.println("There are " + lettercount.countSubstring(str, substr) + " instances of the letter " + substr);	
			prevLetters[j] = substr;
			
			//System.out.println("I've just added an i");			
		} while (isThere == false);
		
	}
	

		
	public static void main(String[] args) {
		System.out.println("Enter some text: ");
		String str = System.console().readLine();
		StringMethodsCaller letters = new StringMethodsCaller();
		letters.checkLetter(str);
	}	
	
}	
