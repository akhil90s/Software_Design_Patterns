package TEMPLATE_DESIGN_PATTERN;

public class Laptop extends ComputerTemplate{

	@Override
	public void installOS() {
		System.out.println("Installing Windows");
		
	}

	@Override
	public void startComputer() {
		System.out.println("Starting Laptop");
		
	}

}
