package chapter03;

public class MyClass {

	private static MyClass instance;

	private MyClass() {

	}

	// Singleton + Factory Method
	public static MyClass getInstance() {
		if (instance == null) {
			instance = new MyClass();
		} else {

		}
		return instance;

	}
	// Factory Method

}
