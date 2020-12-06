package TEMPLATE_DESIGN_PATTERN;

public class Server extends ComputerTemplate{

	@Override
	public void installOS() {
		System.out.println("Installing Linux");
		
	}

	@Override
	public void startComputer() {
		System.out.println("Starting Server");
		
	}

}
