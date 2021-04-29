package paint;

public class Point {
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
	}

	

	public void show() {
		System.out.println("x: " + x + "," + "y: " + y + "Point show()");
	}

	public void show(Boolean visible) {
		System.out.println(x + "," + y + " ");
	}

}
