package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;
	
	public static void main(String[] args) {
		String name = "";
		int price = 0;
		int count = 0;
		Scanner scanner = new Scanner(System.in);

	
		Goods[] goods = new Goods[COUNT_GOODS];

		// 상품 입력
		for(int i = 0; i < COUNT_GOODS; i++) {
			goods[i] = new Goods();		
			name = scanner.next();
			price = scanner.nextInt();
			count = scanner.nextInt();
			goods[i].setName(name);
			goods[i].setPrice(price);
			goods[i].setCount(count);
		}
		
		// 상품 출
		// 상품 입력
		for(int i = 0; i < COUNT_GOODS; i++) {
			goods[i].show();
		}
		// 자원정리
		scanner.close();
	}
}

