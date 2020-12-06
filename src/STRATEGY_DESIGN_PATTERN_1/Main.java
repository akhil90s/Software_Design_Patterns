package STRATEGY_DESIGN_PATTERN_1;

public class Main {

	public static void main(String[] args) {
		
		ShoppingCart shoppingCart = new ShoppingCart();
		
		Product product1 = new Product("P1", 12);
		Product product2 = new Product("P2", 15);
		
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		
		shoppingCart.payment(new DebitCardPaymentMethod("bankName", "debitCardName"));
		shoppingCart.payment(new PaypalPaymentMethod("name", "email","password"));
		shoppingCart.payment(new OnlineTransactionPaymentMethod("onlineMode", "bankName"));
		
	}

}
