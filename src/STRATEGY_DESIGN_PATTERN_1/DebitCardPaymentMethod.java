package STRATEGY_DESIGN_PATTERN_1;

public class DebitCardPaymentMethod implements PaymentMethod {

	String bankName;
	String debitCardName;

	public DebitCardPaymentMethod(String bankName, String debitCardName) {
		super();
		this.bankName = bankName;
		this.debitCardName = debitCardName;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getDebitCardName() {
		return debitCardName;
	}

	public void setDebitCardName(String debitCardName) {
		this.debitCardName = debitCardName;
	}

	@Override
	public void paymentMethod(int amount) {
		System.out.println("Amount payment via card : " + amount);

	}

}
