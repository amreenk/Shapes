class TwoDShape {
	private double width;
	private double height;
	//default constructor
	TwoDShape() {
		width = 0;
		height = 0;
	}
	//parameter Constructor
	TwoDShape(double w, double h) {
		width = w;
		height = h;
	}
	//setter/getter for width 
	double getWidth() {
		return width;
	}
	void setWidth(double x) {
		width = x;
	}
	//setter/getter for height
	double getHeight() {
		return height;
	}
	void setHeight(double a) {
		height = a;
	}

	void showDim() {
		System.out.println("Width: " + width + ", Height: " +
					height);
	}
	//overridden area method
	double area() {
		return -1;
	}
}

//Triangle
class Triangle extends TwoDShape {
	String style;
	
	//parameterized constructor
	Triangle(String s, double x, double y) {
		super(x,y);
		style = s;
	}
	//default constructor
	Triangle() {
		super();
		style = "";
	}

	double area() {
		return getWidth() * getHeight() / 2;
	}

	void showStyle() {
		System.out.println("The stye is " + style);
	}
}

//Rectangle
class Rectangle extends TwoDShape {
	//default construcor
	Rectangle() {
		super();
	}
	//Parameterized Constructor
	Rectangle(double w, double h) {
		super(w,h);
	}

	boolean isSquare() {
		if(getWidth() == getHeight()) {
			return true;
		}
		else if (getWidth() == 0) {
			return false;
		}
		else {
			return false;
		}
	}

	double area() {
		return getWidth() * getHeight();
	}
}

//Circle
class Circle extends TwoDShape {
	
	//parameterized constructor
	Circle(double r) {
		super(2*r, 2*r);

	}
	
	void showDim() {
		System.out.println("Radius: " + (getWidth()/2) + ", value of Pie: " +
					Math.PI);
	}

	double area() {
		return Math.PI * ((getHeight()/2)*(getWidth()/2));
	}
}


class Shapes6 {
	public static void main(String[] args) {
		//Triangle
		Triangle t1 = new Triangle("filled", 10.0, 13.5);
		System.out.println("info of t1 or Triangle:");
		t1.showDim();
		t1.showStyle();
		System.out.println("area is " + t1.area());

		System.out.println();

		//Superclass TwoDShape
		System.out.println("info of twoD:");
		TwoDShape twoD = new TwoDShape(5,4);
		twoD.showDim();
		System.out.println("area of twoD shape is: " + twoD.area());

		System.out.println();

		//Rectangle
		Rectangle r1 = new Rectangle(3,8);
		System.out.println("info of r1 or Rectangle: ");
		System.out.print("is this a square?");
		System.out.println(r1.isSquare());
		System.out.println("area is " + r1.area());

		System.out.println();

		//Circle
		Circle c1 = new Circle(3);
		System.out.println("info of c1 or circle: ");
		c1.showDim();
		System.out.println("area is: " + c1.area());
	}
}