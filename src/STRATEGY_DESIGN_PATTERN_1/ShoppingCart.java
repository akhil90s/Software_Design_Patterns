package STRATEGY_DESIGN_PATTERN_1;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

	private List<Product> productList;
	
	public ShoppingCart() {
		productList = new ArrayList<>();
	}
	
	public void addProduct(Product product) {
		productList.add(product);
	}
	
	private int getTotalPrice() {
		return productList.stream().map(p-> p.getProductAmount()).reduce(0, Integer::sum);
	}
	
	public void payment(PaymentMethod paymentMethod) {
		paymentMethod.paymentMethod(getTotalPrice());
	}
	
}
