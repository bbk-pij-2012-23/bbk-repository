print "this is palindrome checker. enter some text and i will check whether it is a palindrome: ";
String str = System.console().readLine();
int j = str.length() - 1;
println j%2
int i = 0;
boolean pali = true;
if (j % 2 == 0) {
	while (i != j) {
	char lefty = str.charAt(i);
	char righto = str.charAt(j);
		if (lefty != righto) {
			pali = false;
			}
		i++;
		j--;
		}
	}

else {
	while (i != j-1) {
	char lefty = str.charAt(i)
	char righto = str.charAt(j)
		if (lefty != righto) {
			pali = false
		}	
		i++
		j--
		
	}	
}
if (pali == true) {
	println "that's a palindrome!";
}
else {
	println "that's not a palindrome";
}