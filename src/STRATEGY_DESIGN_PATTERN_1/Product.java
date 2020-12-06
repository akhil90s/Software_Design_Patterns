package STRATEGY_DESIGN_PATTERN_1;

public class Product {
	
	private String productName;
	private int productAmount;
	
	public Product(String productName, int productAmount) {
		super();
		this.productName = productName;
		this.productAmount = productAmount;
	}
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	
	

}
