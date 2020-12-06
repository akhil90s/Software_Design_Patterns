package TEMPLATE_DESIGN_PATTERN;

public abstract class ComputerTemplate {

	public final void buildComputer() {
		collectComponents();
		assembleComponents();
		installOS();
		startComputer();

	}

	private void collectComponents() {
		System.out.println("Collecting component");
	}

	private void assembleComponents() {
		System.out.println("Assembling Component");
	}
	
	public abstract void installOS();
	
	public abstract void startComputer();

}
