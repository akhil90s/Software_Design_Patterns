package FACTORY_DESIGN_PATTERN;

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
