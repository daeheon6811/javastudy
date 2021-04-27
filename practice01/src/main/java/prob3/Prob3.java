package prob3;

import java.util.Scanner;

public class Prob3 {

	/*
	 * [문제 3] 숫자를 입력 받아서 아래와 같은 실행결과가 나타나도록 Prob3 클래스의 main 메쏘드를 완성하세요 a. 입력 받은 숫자가
	 * 홀수인 경우에는, 0 부터 입력 값까지 홀수의 합을 출력합니다. - 예제 : 입력이 7 이면 16을 출력 ( 1 + 3 + 5 + 7 =
	 * 16 ) b. 입력 받은 숫자가 짝수인 경우에는, 0 부터 입력 값까지 짝수의 합을 출력합니다. - 예제 : 입력이 10 이면 30을 출력
	 * ( 2 + 4 + 6 + 8 + 10 = 30 )
	 * 
	 * 숫자를 입력하세요: 7 결과 값 : 16
	 * 
	 * 숫자를 입력하세요: 10 결과 값 : 30
	 * 
	 * 숫자를 입력하세요: 11 결과 값 : 36
	 * 
	 * <<실행결과>>
	 * 
	 */
	/*
	 * public static int recursion(int number) {
	 * 
	 * int sum = 0;
	 * 
	 * if (number == 1) { sum++; return sum; } else if (number == 0) {
	 * 
	 * return sum; } else {
	 * 
	 * sum += number; return recursion(number / 2); }
	 * 
	 * }
	 */

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int number = scanner.nextInt();
		int sum = 0;

		if (number % 2 == 0) {
			for (int i = 1; i <= number; i++) {
				if (i % 2 == 0) { // 짝
					sum += i;
				}
			}
		}
		else {
			for (int i = 1; i <= number; i++) {
				if (i % 2 == 1) { // 짝
					sum += i;
				}
			}
		}

		System.out.println(sum);

		/* 코드 작성 */

		scanner.close();
	}
}
