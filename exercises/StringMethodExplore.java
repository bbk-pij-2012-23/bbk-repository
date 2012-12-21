/* Look ups
* --Declaring not initialising: 
* tried just declaring but not initialising string str but it complained that
* might not have initialised in while loop so added the "";
* --import java.util.*; to access regex; see also good sol to split without removing
* char (which I couldn't work out) - at first I did String[] splitString = noSpaces.split("[\\D]");
* http://stackoverflow.com/questions/4416425/how-to-split-string-with-some-seperator-but-without-removing-that-seperator-in-j
* (note: his sol didn't work without adding | between the two expressions)
*
*
* Errors:
* --initially tried to print str after str.replaceAll(...), rather than creating a new string
* and printing that. printing str just outputed whatever I put in.
* Note: System.out.println(str.replaceAll(" ", "")) would also solve that
* 
* Typos:
* used forward slash rather than backslash and spent ages trying to work out why regex
* was recognised
*
*/

import java.util.*;

public class StringMethodExplore{
	
	public static void main(String[] args){
		StringMethodExplore run = new StringMethodExplore();
		run.launch();
	}

	public void launch(){
		
		String str = "";
		
		while (!str.equals("-1")){
			System.out.println(">");
			str = System.console().readLine();
			String noSpaces = str.replaceAll(" ", "");
			String[] splitString = noSpaces.split("(?=\\D)|(?<=\\D)");
			for(int i = 0; i< splitString.length; i++){
				System.out.println(splitString[i]);
			}
		}
		
		
		
		
	}

}

/*next look up matching
1. match bracketed substrings then split 
	how to find literal bracket? \(?
2. parse within brackets and run calculation 
	needs variable that can be used later
3. parse outside brackets and complete calculation
	start with simple operators and check Math for more complex calcs
*/
