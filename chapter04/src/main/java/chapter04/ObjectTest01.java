package chapter04;

public class ObjectTest01 {

	
	public static void main(String[] args) {
		Point p = new Point(10, 10);
		
		Class cla = p.getClass();
		
		

		
		System.out.println(cla);
		System.out.println(p.getClass()); // reflection
		System.out.println(p.hashCode()); // addrees 기반의 hash value 출력
		                                  // address X
		                                  // reference X
		System.out.println(p.toString());
		System.out.println(p);
	}

}
