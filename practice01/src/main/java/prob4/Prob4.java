package prob4;

import java.util.Scanner;

import javax.print.DocFlavor.INPUT_STREAM;

public class Prob4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("문자열을 입력하세요 : ");
		String text = scanner.nextLine();
		int count = 0;
		char temp[] = null;

		for (int i = 0; i < text.length(); i++) {

			if (text.charAt(i) == ' ')
				count++;

			for (int j = 0; j < i + count; j++) {

				System.out.print(text.charAt(j));

			}
			System.out.println();
		}

		scanner.close();
	}

}
