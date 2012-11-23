public class StringCounter {

	public boolean isMatch(String str, String substr, int i) {
		boolean isMatch = false;
		int j = 0;
		while (j < substr.length()){
			if (i + j >= str.length()){ //catch an error if the last char of str == substr.charAt(0)
				isMatch = false;
			}	
			else if (substr.charAt(0 + j) == str.charAt(i + j)) {
				//System.out.println(true);
				isMatch = true;
			}
			else {
				isMatch = false;
				//System.out.println(false);
				continue;
			}
			j++;
		}
		return isMatch;
	}

	public int countSubstring(String str, String substr) {
		int i = 0;
		int total = 0;
		while(i < str.length()){
			if (str.charAt(i) == substr.charAt(0)){
				if (isMatch(str, substr, i) == true){ //got this wrong in the handwritten code: don't forget this method doesn't know what 
					total++;			//isMatch the variable is, just the method - might be better to rename boolean to
				}					// avoid confusion.	
			}
			i++;
		}
		return total;
	}

	public static void main(String[] args){
		System.out.println("Enter a short string: ");
		String substr = System.console().readLine();
		System.out.println("Now enter a longer string and I will count instances of the short string in it");
		String str = System.console().readLine();
		StringCounter count = new StringCounter();
		System.out.println("There were " + count.countSubstring(str, substr) + " instances of " + substr);
	}	

}	
