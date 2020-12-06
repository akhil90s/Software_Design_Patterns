package STRATEGY_DESIGN_PATTERN_1;

public class OnlineTransactionPaymentMethod implements PaymentMethod {

	String onlineMode;
	String bankName;
		
	public OnlineTransactionPaymentMethod(String onlineMode, String bankName) {
		super();
		this.onlineMode = onlineMode;
		this.bankName = bankName;
	}


	public String getOnlineMode() {
		return onlineMode;
	}


	public void setOnlineMode(String onlineMode) {
		this.onlineMode = onlineMode;
	}


	public String getBankName() {
		return bankName;
	}


	public void setBankName(String bankName) {
		this.bankName = bankName;
	}


	@Override
	public void paymentMethod(int amount) {
		System.out.println("Amount payment via online transaction : " + amount);
	}

}
