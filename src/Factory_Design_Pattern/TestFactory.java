package Factory_Design_Pattern;

public class TestFactory {

	public static void main(String[] args) {
		
		digitalFunctions df1 = DigitalFunctionsFactory.getDigitalFunctionCloud("AWS");
		df1.getSystemRAM();
		
		digitalFunctions df2 = DigitalFunctionsFactory.getDigitalFunctionCloud("Azure");
		df2.getSystemRAM();
		
		
	}

}
