package prob06;

public abstract class Calc {
	private int a;
	private int b;
	public void setValue(int a, int b) {
		this.a = a;
		this.b = b;
	}
	abstract public int calculate();
}
