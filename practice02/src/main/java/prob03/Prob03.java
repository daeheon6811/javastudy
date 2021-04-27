package prob03;

import java.util.Scanner;

public class Prob03 {
	public static void printCharArray(char[] c) {		
		for(char value : c) {			
			System.out.print(value + "");			
		}

	}

	public static void replaceSpace(char[] c) {
		for(int i = 0 ; i < c.length; i++) {
			if(c[i]== ' ')
			 c[i] = 'A';
		}
	}


	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

		// 원래 배열 원소 출력
		printCharArray(c);

		Scanner scanner = new Scanner(System.in);

		// 공백 문자 바꾸기  // A 로 바꿨습니다!
		replaceSpace(c);

		System.out.println();
		// 수정된 배열 원소 출력
		printCharArray(c);
	}

}
