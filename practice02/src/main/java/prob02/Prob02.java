package prob02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Prob02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		double sum = 0;
		
		/* 키보드에서 배열 크기만큼 입력 받아 배열에 저장하는 코드 */
		System.out.println("배열 크기 입력");
		int value = scanner.nextInt();
		
		int[] intArray = new int[ value ];
	    
		for(int i = 0; i < intArray.length; i++) {
			System.out.println("값 입력 index : " + i );
			value = scanner.nextInt();
		    intArray[i] = i;
		}
		
		
		/* 배열에 저장된 정수 값 더하기 */
		for(int i = 0 ; i < intArray.length; i++) {
			sum = sum + intArray[i];
		}
		
		/* 출력 */
		
		System.out.println((int)sum);
		/* 자원정리 */
		scanner.close();
	}
}
