print "enter some text: "
String str = System.console().readLine()

int i = 0;
int es = 0;
while (i < str.length()) {
	String s = str.charAt(i);
	i++
	if (s=="e") {
		es++
	}
}	
println "You have typed " + es + " Es";
	