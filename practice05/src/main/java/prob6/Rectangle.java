package prob6;

public class Rectangle extends Shape implements Resizable {

	private double width;
	private double height;

	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return 2 * (width + height);
	}

	@Override
	public void resize(double d) {
		this.width = (width * d);
		this.height = (height * d);
		}

}
