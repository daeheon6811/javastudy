package chapter03;

public class Goods2App {
	
	public static void main(String[] args) {
		Goods2 goods = new Goods2();
		
		
		goods.setName("Hello");
		goods.setPrice(10000);
		goods.setCountSold(20);
		goods.setCountStock(30);
		
		System.out.println(goods.calculateDiscountPrice(0.5));
		goods.setPrice(-1);
		goods.showInfo();
		
		Goods2 goods2 = new Goods2("cannon",1,1,1);
		
		goods2.showInfo();
		
	
	}

}
