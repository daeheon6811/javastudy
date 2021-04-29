package paint;

public class Point implements Drawable{
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
		
	}

	

	@Override
	public void draw() {
		System.out.println("x: " + x + "," + "y: " + y + "Point show()");
	}

	public void show(Boolean visible) {
		System.out.println(x + "," + y + " ");
	}
	
	

}
