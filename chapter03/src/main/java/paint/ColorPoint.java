package paint;

public class ColorPoint extends Point{
	
	private String color;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	

	@Override
	public void show() {
		System.out.println("" +color + "출력 ColorPoint show() ");
	}

	@Override
	public void show(Boolean visible) {
		// TODO Auto-generated method stub
		super.show(visible);
	}
	
	
	
}
