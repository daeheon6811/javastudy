package exception;

public class ExceptionTest {

	
	/*
	@author 
	
	try
	catch
	*/
	public static void main(String[] args) {

		int a = 10;
		int b = 10 - a;

		System.out.println("some codes 1");
		try {
			System.out.println("some codes 2");
			System.out.println("some code 3");
			int result = (1 + 2 + 3) / b;
		} catch (ArithmeticException e) {
			// 1.사과
			System.out.println("미안합니다.");
			// 2.로깅
			System.out.println("error:" + e);
			// 3. 정상 종료
			return;
			// System.out.println("error" + e);

		} finally {
			/* 자원정리 */
			System.out.println("some codes...final(자원정리)");
			System.out.println("some code  4");
		}

		
	}

}
