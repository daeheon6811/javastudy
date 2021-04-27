package prob03;

import java.util.Scanner;

public class Prob03 {
	public void printCharArray(char[] c) {
		
	}
	
	public static void main(String args[]) {
		char c[] = { 'T', 'h', 'i', 's', ' ', 'i', 's', ' ', 'a', ' ', 'p', 'e', 'n', 'c', 'i', 'l', '.' };

				
	
		// 원래 배열 원소 출력
		printCharArray(c);

		Scanner scanner = new Scanner(System.in);
		
		
		// 공백 문자 바꾸기
		replaceSpace(c);

		// 수정된 배열 원소 출력
		printCharArray(c);
	}

}
