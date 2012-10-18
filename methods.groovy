
public class Point {
	private double x;
	private double y

	public Point() {
	}
	
	public Point (double x1, double x2) {
		this.x = x1;
		this.y = y1;
	}
	
	public void setX (double x2) {
		this.x = x2;
	}
	
	public void setY (double y2) {
		this.y = y2;
	}
	
	double getX() {
		return x;
	}
	
	double getY() {
		return y;
	}
	
	double clone() {
		Point copy = new Point();
		copy.setX(x);
		copy.setY(y);
		return copy;
	}
}	
	
	
print "enter your coords: x = "
String str = System.console().readLine();
Print "y = "
String str1 = System.console().readLine();

Point newPoint = new Point();
newPoint.x = Double.parseDouble(str);
newPoint.y = Double.parseDouble(str1);

println "your points were " + clone(newPoint);