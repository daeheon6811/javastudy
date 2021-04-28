package mypackage;

public class Goods {
	
	public static int countOfGoods;
	
	public Goods() {
		Goods.countOfGoods++;
	}
	
	 public String name; // 모든 접근 가능
	 protected int price; // 같은 패키지 + 자식 접근 가능
	 int countStock; // 디폴트 , 같은 패키지
	 private int countSold; // 클래스 내부에서만 접근이 가능
	 
	 
	 
	 
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCountStock() {
		return countStock;
	}
	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}
	public int getCountSold() {
		return countSold;
	}
	public void setCountSold(int countSold) {
		this.countSold = countSold;
	}
	 
	 
}




