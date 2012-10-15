print "enter some text: ";
String str = System.console().readLine();

int i = 0;
int es = 0;
while (i < str.length()) {
	String s = str.charAt(i);
	i++;
	if (s=="e") {
		es++;
	}
}	
println "You have typed " + es + " Es";
	

	//next section

print "now enter some more text: ";
str = System.console().readLine();
println "What letter shall I count? "
String letter = System.console().readLine();
i = 0;
es = 0;

while (i < str.length()) {
	s = str.charAt(i);
	i++;
	if (s == letter) {
		es++;
	}	
}	

println "You have typed " + es + " " + letter + "s"
