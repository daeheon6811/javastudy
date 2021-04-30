package prob6;

public class RectTriangle extends Shape  {
	
	private double width;
	private double height;
	

	public RectTriangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	protected double getArea() {
		// TODO Auto-generated method stub
		return (width * height * 0.5);
	}

	@Override
	protected double getPerimeter() {
		// TODO Auto-generated method stub
		return (width + height) + Math.sqrt(width) + Math.sqrt(height);
	}
}
