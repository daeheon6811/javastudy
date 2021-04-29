package paint;

import java.awt.geom.Point2D;

public class PaintApp {
	
	public static void main(String[] args) {
		Point point1 =  new Point(10,20);
		point1.show();
		
		Point point2 = new Point(100,200);
		point2.show();
		
		point1.show(false);		
		Point point3 = new ColorPoint(50,100,"red");
	
		((ColorPoint)(point3)).setColor("red");
		point3.show();
		
		 drawPoint(point3);
		 
		 
		 Rect rect = new Rect();
		 Triangle triangle = new Triangle();
		 Circle circle = new Circle();
		 

		 drawShape(triangle);
		 drawShape(rect);
		 drawShape(circle);
	}
	
	public static void drawPoint(Point pt) {
		pt.show();
	}

	
	public static void drawrect(Rect rect) {
		rect.draw();
	}

	public static void drawTriangle(Triangle triangle) {
		triangle.draw();
	}
	
	
	public static void drawShape(Shape shape) {
		shape.draw();
	}
}
