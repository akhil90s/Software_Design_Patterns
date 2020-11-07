package FLYWEIGHT_DESIGN_PATTERN;

public class Cycle implements Vehicle{
	
	private final String MAXSPEED; // Intrinsic Property
	private String colour; // Extrinsic Property
	
	public Cycle() {
		MAXSPEED = "15km/hr";
	}
	
	@Override
	public void assignColour(String colour) {
		this.colour = colour;
	}

	@Override
	public void startEngine() {
		System.out.println(colour + " cycle with max speed is " + MAXSPEED);
	}
	
	
}
