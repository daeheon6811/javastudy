package chapter03;

import mypackage.Goods;

public class DiscountGoods extends Goods {
	
	private float discountRate = 0.5f;

	public float getDiscountPrice() {
		return price * discountRate;
		
	}

	
	
	
	
	


}
