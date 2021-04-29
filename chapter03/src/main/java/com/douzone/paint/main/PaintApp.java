package com.douzone.paint.main;



import com.douzone.paint.i.Drawable;
import com.douzone.paint.point.Point;
import com.douzone.paint.shape.Circle;
import com.douzone.paint.shape.Rect;
import com.douzone.paint.shape.Shape;
import com.douzone.paint.shape.Triangle;
import com.douzone.paint.text.GraphicText;

public class PaintApp {

	public static void main(String[] args) {
		Point point1 = new Point(10, 20);
		draw(point1);

		Point point2 = new Point(100, 200);
		draw(point2);
		/*
		 * point1.show(false); Point point3 = new ColorPoint(50, 100, "red");
		 * 
		 * ((ColorPoint) (point3)).setColor("red"); point3.show();
		 */
		// drawPoint(point3);

		Rect rect = new Rect();
		Triangle triangle = new Triangle();
		Circle circle = new Circle();

		
		draw(rect);
		draw(triangle);
		draw(circle);
		
		
		Drawable drawable;
		draw(new GraphicText("HELLO~"));
		
		
		System.out.println(circle instanceof Object);
		System.out.println(circle instanceof Shape);
	
		
		// class hierachy 상위와 하위만 instanceof 연산자를 사용할 수 없다.
		// System.out.println(circle instanceof Rect);
		Shape s = new Circle();
		System.out.println(s instanceof Object);
		System.out.println(s instanceof Shape);
		System.out.println(s instanceof Rect);
		System.out.println(s instanceof Circle);
	
		// interface는 hierachy와 상관없이 
		// instanceof 연사자를 사용 할 수 없디.
		System.out.println(s instanceof Drawable);
		System.out.println(s instanceof Runnable);
		
	
		
        //drawShape(triangle);
		// drawShape(rect);
		// drawShape(circle);
	}

	public static void draw(Drawable drawable) {
		drawable.draw();
	}

	/*
	 * public static void drawPoint(Point pt) { pt.show(); }
	 * 
	 * public static void drawrect(Rect rect) { rect.draw(); }
	 * 
	 * public static void drawTriangle(Triangle triangle) { triangle.draw(); }
	 * 
	 * public static void drawShape(Shape shape) { shape.draw(); }
	 */
}
