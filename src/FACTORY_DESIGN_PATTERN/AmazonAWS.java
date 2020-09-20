package FACTORY_DESIGN_PATTERN;

public class AmazonAWS implements digitalFunctions {

	@Override
	public void getSystemRAM() {
		
		System.out.println("System RAM: AWS");
		
	}

	@Override
	public void getSystemProcessingSpeed() {
		
		System.out.println("Processing Speed : AWS");
		
	}

	
}
