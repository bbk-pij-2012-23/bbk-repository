// D3 11 rectangle

class Point {
	double x;
	double y;
}

Point upleft = new Point();
Point downright = new Point();

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

print "bottom right = ";
str = System.console().readLine();

i = 0;
j = str.length()

while (i < j) {
	c = str.charAt(i);
	if (c == ',') {
		downright.x = Double.parseDouble(str.substring(0, i));
		downright.y = Double.parseDouble(str.substring(i + 1, j));
	
	}	
	i++
}

if (downright.x == 0 || downright.y == 0 || upleft.x == 0 || upleft.y == 0) {
print "this won't work at the moment, I need to change the calculation from multiplication to addition";
}
else {
	d = (upleft.x - downright.x) * (upleft.y - downright.y);

	println upleft.x + "," + upleft.y;
	println downright.x + "," + downright.y;
	println "the area is " + area;
}

	
