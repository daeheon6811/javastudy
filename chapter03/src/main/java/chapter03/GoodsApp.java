package chapter03;

import mypackage.Goods;

public class GoodsApp {

	public static void main(String[] args) {

		Goods goods1 = new Goods();
		
		
		
		
		goods1.name = "carmear";
		// goods1.price = 1000;
		// goods1.countStock = 50;
		
	
		// goods1.countSold = 20;

		System.out.println(goods1.name);

		Goods goods2 = new Goods();
		Goods goods3 = new Goods();

		System.out.println(Goods.countOfGoods);

	}

}
