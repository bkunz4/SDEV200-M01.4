class RegularPolygon {
	private int n;
	private double side;
	private double x;
	private double y;

  /*Creates regular polygon with default values*/
	RegularPolygon() {
		n = 3;
		side = 1;
		x = y = 0;
	}

  /*Creates a regular polygon with the specified number of sides and length of side, centered at (0, 0)*/
	RegularPolygon(int n, double side) {
		this.n = n;
		this.side = side;
		x = y = 0;
	}

  /*Creates a regular polygon with the specified number of sides, length of side, and x, y coordinates*/
	RegularPolygon(int n, double side, double x, double y) {
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
  /*Sets new n*/
	public void setN(int n) {
		this.n = n;
	}
  /*Sets length of new side*/
	public void setSide(double side) {
		this.side = side;
	}
  /*Sets new x coordinate*/
	public void setX(int x) {
		this.x = x;
	}
  /*Sets new y coordinate*/
	public void setY(int y) {
		this.y = y;
	}
  /*Returns n*/
	public int getN() {
		return n;
	}

	public double getSide() {
		return side;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double getPerimeter() {
		return (side * n);
	}

	public double getArea() {
		return (side * side * n) / (4 * Math.tan(Math.PI / n));
	}
}

/*Displays results//UML diagram*/
public class geometry {
	public static void main(String[] args) {
		RegularPolygon polygonArr[] = new RegularPolygon[3];
		polygonArr[0] = new RegularPolygon();
		polygonArr[1] = new RegularPolygon(6, 4);
		polygonArr[2] = new RegularPolygon(10, 4, 5.6, 7.8);
		for (int i = 0; i < polygonArr.length; i++) {
			System.out.println("Polygon " + (i + 1) + " perimeter: " + polygonArr[i].getPerimeter());
			System.out.println("Polygon " + (i + 1) + " area: " + polygonArr[i].getArea());
		}
	}
}