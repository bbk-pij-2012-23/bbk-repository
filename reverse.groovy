print "this is a palindrome maker. Enter some text: "
String str = System.console().readLine()
int j = str.length() - 1
int i = 0
print str

while (j >= 0) {
	String s = str.charAt(j);
	print s;
	j--
}	
	
	