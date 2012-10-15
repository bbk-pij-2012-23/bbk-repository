

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
	