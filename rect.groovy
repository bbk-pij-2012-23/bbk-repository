// D3 11 rectangle
class Rectangle {
	Point upleft;
	Point downright;

}

println "please enter the coordinates of the top left and bottom right corners of your rectangle. Use the format n,n (number comma number, without spaces).";
print "top left = ";
String str = System.console().readLine();


int i = 0;
int j = str.length()

while (i < j) {
	char c = str.charAt(i);
	if (c == ',') {
		upleft.x = Double.parseDouble(str.substring(0, i));
		upleft.y = Double.parseDouble(str.substring(i + 1, j));
	
	}	
	i++
}

println upleft.x + "," + upleft.y;

	
