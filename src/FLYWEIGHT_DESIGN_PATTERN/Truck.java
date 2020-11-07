package FLYWEIGHT_DESIGN_PATTERN;

public class Truck implements Vehicle{

	private final String MAXSPEED; // Intrinsic Property
	private String colour; // Extrinsic Property
	
	public Truck() {
		MAXSPEED = "120km/hr";
	}
	
	@Override
	public void assignColour(String colour) {
		this.colour = colour;
	}

	@Override
	public void startEngine() {
		System.out.println(colour + " truck with max speed is " + MAXSPEED);
	}

}
