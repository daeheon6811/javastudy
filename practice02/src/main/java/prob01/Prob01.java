package prob01;

import java.util.Scanner;

public class Prob01 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int[] MONEYS = { 50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1 };

		System.out.println("금액 입력");
		int value = scanner.nextInt();

		int count = 0;

		for (int i = 0; i < MONEYS.length; i++) {

			if (MONEYS[i] <= value) {

				System.out.println(MONEYS[i] + "갯수" + (value / MONEYS[i]) + "개");

			}
		}

		scanner.close();
	}
}