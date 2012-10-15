// 3 Line to column
// Write a program that reads some text from the user and then writes the same text on screen, but each  
// letter on a different line. Use while loops and for loops. What version looks clearer?
// Now modify your program to write each word (as defined by spaces) rather than letter on a different line.

print "Please enter some text: "
String str = System.console().readLine();
int lastchar = str.length();

// at first I put lastchar as the termination, but i is the counter, not lastchar so its i<lastchar)
for (int i = 0; i<lastchar; i++) { 
	String s = str.charAt(i);
	println s;
}	

print "Now please enter some more text: "
str = System.console().readLine();
lastchar = str.length();
int i = 0;

while (i < lastchar) {
	String s = str.charAt(i);
	println s;
	i++;
}	
//I can't see much difference in clarity of while loops and for loops

print "OK, this is the last time, please enter some text: "
str = System.console()readLine();
lastchar = str.length()
i = 0;
int j = 0;
for (i; i < lastchar; i++) {
	char c = str.charAt(i);
	if (c == ' ' || i == lastchar-1 ) {
		if (j==0) {
			println str.substring(j,i+1);
			j=i;
		}
		else{
			println str.substring(j+1,i+1);
			j=i;
		}	
	}
}			
	