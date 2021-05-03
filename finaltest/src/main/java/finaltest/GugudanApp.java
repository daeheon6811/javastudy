package finaltest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class GugudanApp {
	public static void main(String[] args) {
		final int SIZE = 9;

		int k = 1;
		int answer = 0;
		int leftvalue = (int) (Math.random() * SIZE + 1);
		int rightvalue = (int) (Math.random() * SIZE + 1);
		int result = leftvalue * rightvalue;

		Set<Gugudan> set = new HashSet<Gugudan>();

		/*
		 * 데이터 초기 셋팅 for (int i = 1; i <= SIZE; i++) { for (int j = 1; j <= SIZE; j++) {
		 * if (i * j != result) { set.add(new Gugudan(i, j)); } } }
		 */

		int lefttemp = 0;
		int righttemp = 0;

		while (true) {

			lefttemp = (int) (Math.random() * 9 + 1);
			righttemp = (int) (Math.random() * 9 + 1);

			if (lefttemp * righttemp != result) {
				set.add(new Gugudan(lefttemp, righttemp));
			}
			if (set.size() == 8) {
				break;
			}
		}

		System.out.println(leftvalue + "X" + rightvalue + " == ? ");
		Iterator<Gugudan> it = set.iterator(); // Iterator(반복자) 생성
		int answerindex = (int) (Math.random() * SIZE + 1); // 결과 값을 9개 위치에서 저장
		System.out.println(answerindex);

		int count = 0;
		int i = 1;
		/*
		 * for (Gugudan g : set) {
		 * 
		 * }
		 */
		while (it.hasNext()) {

			if (i != answerindex) {
				System.out.print(it.next() + " ");

			} else {
				System.out.print(result + " ");
			}

			if (i % 3 == 0) {
				System.out.println();
			}

			i++;
		}

		Scanner scanner = new Scanner(System.in);
		answer = scanner.nextInt();
		scanner.nextLine();
		if (answer == result) {
			System.out.println("정답!");
		} else {
			System.out.println("오답!");
		}

	}
}
