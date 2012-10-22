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

// 1v2; 1v3; 2v3 

double d1 = ((firstpoint.x - secpoint.x) * (firstpoint.x - secpoint.x)) + ((firstpoint.y - secpoint.y) * (firstpoint.y-secpoint.y))
double result1 = Math.sqrt(d1)

double d2 = ((firstpoint.x - thirdpoint.x) * (firstpoint.x - thirdpoint.x)) + ((firstpoint.y - thirdpoint.y) * (firstpoint.y-thirdpoint.y)) ;
double result2 = Math.sqrt(d2);

double d3 = ((secpoint.x - thirdpoint.x) * (secpoint.x - thirdpoint.x)) + ((secpoint.y - thirdpoint.y) * (secpoint.y-thirdpoint.y));
double result3 = Math.sqrt(d3);

println "distance between first and second point = " + result1;
println "distance between first and third point = " + result2;
println "distance between second and third point = " + result3;

if (result1 < result2 && result1 < result3) {
	print "the distance between the first and second point is the shortest";
}
else if (result2 < result1 && result2 < result3) {
	print "the distance between the first and third point is the shortest";
}
else {
	print "the distance between the second and third point is the shortest";
}	


