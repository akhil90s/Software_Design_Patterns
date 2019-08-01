package Factory_Design_Pattern;

public class MicrosoftAzure implements digitalFunctions{

	@Override
	public void getSystemRAM() {
		
		System.out.println("System RAM: Azure");
		
	}

	@Override
	public void getSystemProcessingSpeed() {
		
		System.out.println("Processing Speed : Azure");
		
	}

}
