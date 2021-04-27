package prob05;

import java.util.Random;
import java.util.Scanner;

public class Prob05 {

	public static void main(String[] args) {
		int temp = 0;
		int value = 0;
		Scanner scanner = new Scanner(System.in);
		// 정답 램덤하게 만들기
		Random random = new Random();
		int correctNumber = random.nextInt(100) + 1;
		System.out.println(correctNumber);
		
		while (true) {

			
			/* 게임 작성 */
			value = scanner.nextInt();
			if (correctNumber == value) {
				System.out.println("정답!" + value);
				
				// 새 게임 여부 확인하기
				System.out.print("다시 하겠습니까(y/n)>>");
				String answer = scanner.next();
				correctNumber = random.nextInt(100) + 1;
				if ("y".equals(answer) == false) {
					break;
				}
			} else {

				if (value < correctNumber) {
					System.out.println("땡! " + " " + value + "~" + "100 ");
				} else {
					System.out.println("땡! " + " " + correctNumber + "~" + value);
				}
			}

		}

		scanner.close();
	}

}