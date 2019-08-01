package Factory_Design_Pattern;

public class DigitalFunctionsFactory {

	public static digitalFunctions getDigitalFunctionCloud(String cloudType) {

		if (cloudType.equalsIgnoreCase("AWS")) {
			return new AmazonAWS();
		}
		if (cloudType.equalsIgnoreCase("Azure")) {
			return new MicrosoftAzure();
		}

		return null;
	}

}
