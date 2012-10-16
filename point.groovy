println "please enter the coordinates of your three points.";
print "first coordinates: x = ";
String str = System.console().readLine();

class Point {
	double x;
	double y;
}
Point firstpoint = new Point();
firstpoint.x = Double.parseDouble(str);
print "and y = ";
str = System.console().readLine();
firstpoint.y = Double.parseDouble(str);

print "second coordinates: x = ";
str = System.console().readLine();
Point secpoint = new Point();
secpoint.x = Double.parseDouble(str);
print "and y = ";
str = System.console().readLine();
secpoint.y = Double.parseDouble(str);

print "third coordinates: x = ";
str = System.console().readLine();
Point thirdpoint = new Point();
thirdpoint.x = Double.parseDouble(str);
print "and y = ";
str = System.console().readLine();
thirdpoint.y = Double.parseDouble(str);

println "your coordinates are 1(" + firstpoint.x + "," + firstpoint.y + "), 2(" + secpoint.x + "," +secpoint.y + "), 3(" + thirdpoint.x + "," + thirdpoint.y + ")";

double distance(double x1, double y1, double x2, double y2) {
	double result = ((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2))



