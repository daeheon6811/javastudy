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
		int result = leftvalue * rightvalue;

		Set<Gugudan> set = new HashSet<Gugudan>();

		/* 데이터 초기 셋팅 */
		for (int i = 1; i <= SIZE; i++) {
			for (int j = 1; j <= SIZE; j++) {
				set.add(new Gugudan(i, j));
			}
		}

	
		Iterator<Gugudan> it = set.iterator(); // Iterator(반복자) 생성
		int answerindex = (int) (Math.random() * SIZE + 1); // 결과 값을 9개 위치에서 저장
		System.out.println(answerindex);

		while (it.hasNext()) {

			
			k++;
		}

	
		
		Scanner scanner = new Scanner(System.in);
		answer = scanner.nextInt();
	    scanner.nextLine();
		if(answer == result) {
			System.out.println("정답!");
		}
		else {
			System.out.println("오답!");
		}

	}
}
